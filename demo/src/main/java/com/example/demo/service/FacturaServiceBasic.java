package com.example.demo.service;

import java.util.Date;

import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroCuenta;

public class FacturaServiceBasic implements FacturaService {

	@Override
	public RegistroCuenta registrarCompraGasto(Factura factura, String descripcion) {
		
		String codigo = factura.getCodigo();
		double valor = factura.getValor();
		String tipo = "gasto";
		Date fecha = factura.getFecha();
		
		RegistroCuenta registroCuenta = new RegistroCuenta(descripcion, codigo, fecha, tipo, valor);
		
		return registroCuenta;
	}

	@Override
	public RegistroCuenta registrarCompraCosto(Factura factura, String descripcion) {
		String codigo = factura.getCodigo();
		double valor = factura.getValor();
		String tipo = "costo";
		Date fecha = factura.getFecha();
		
		RegistroCuenta registroCuenta = new RegistroCuenta(descripcion, codigo, fecha, tipo, valor);
		
		return registroCuenta;
	}
	
	@Override
	public RegistroCuenta registrarVenta(Factura factura, String descripcion) {
		String codigo = factura.getCodigo();
		double valor = factura.getValor();
		String tipo = "ingreso";
		Date fecha = factura.getFecha();
		
		RegistroCuenta registroCuenta = new RegistroCuenta(descripcion, codigo, fecha, tipo, valor);
		
		return registroCuenta;
	}

}
