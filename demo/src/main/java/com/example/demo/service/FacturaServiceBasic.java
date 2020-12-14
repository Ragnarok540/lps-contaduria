package com.example.demo.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.bean.BaseDeDatos;
import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroCuenta;

@Service
public class FacturaServiceBasic implements FacturaService {

	private BaseDeDatos baseDeDatos;
	
	public FacturaServiceBasic(BaseDeDatos baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}

	@Override
	public RegistroCuenta registrarCompraGasto(Factura factura, String descripcion) {
		String codigo = factura.getCodigo();
		Date fecha = factura.getFecha();
		double valor = factura.getValor();
		String tipo = "gasto";

		baseDeDatos.getFacturas().add(factura);
		
		RegistroCuenta registroCuenta = new RegistroCuenta(descripcion, codigo, fecha, tipo, valor);
		
		baseDeDatos.getRegistrosCuenta().add(registroCuenta);
		
		return registroCuenta;
	}

	@Override
	public RegistroCuenta registrarCompraCosto(Factura factura, String descripcion) {
		String codigo = factura.getCodigo();
		Date fecha = factura.getFecha();
		double valor = factura.getValor();
		String tipo = "costo";

		baseDeDatos.getFacturas().add(factura);
			
		RegistroCuenta registroCuenta = new RegistroCuenta(descripcion, codigo, fecha, tipo, valor);
		
		baseDeDatos.getRegistrosCuenta().add(registroCuenta);
		
		return registroCuenta;
	}
	
	@Override
	public RegistroCuenta registrarVenta(Factura factura, String descripcion) {
		String codigo = factura.getCodigo();
		Date fecha = factura.getFecha();
		double valor = factura.getValor();
		String tipo = "ingreso";

		baseDeDatos.getFacturas().add(factura);
		
		RegistroCuenta registroCuenta = new RegistroCuenta(descripcion, codigo, fecha, tipo, valor);
		
		baseDeDatos.getRegistrosCuenta().add(registroCuenta);
		
		return registroCuenta;
	}

}
