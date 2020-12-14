package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Balance;
import com.example.demo.bean.BaseDeDatos;
import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroContable;
import com.example.demo.bean.RegistroCuenta;

@Service
public class RegistroContableServiceBasic implements RegistroContableService {
	
	private BaseDeDatos baseDeDatos;
	
	public RegistroContableServiceBasic(BaseDeDatos baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}

	@Override
	public RegistroContable registrarPasivo(RegistroCuenta registroCuenta, String nombre) {
		
		String descripcion = registroCuenta.getDescripcion();
		Date fecha = registroCuenta.getFecha();
		String tipo = "pasivo";
		double valor = registroCuenta.getValor();
		
		RegistroContable registroContable = new RegistroContable(descripcion, nombre, fecha, tipo, valor);
		
		baseDeDatos.getRegistrosContables().add(registroContable);
		
		return registroContable;
	}

	@Override
	public RegistroContable registrarActivo(RegistroCuenta registroCuenta, String nombre) {
		String descripcion = registroCuenta.getDescripcion();
		Date fecha = registroCuenta.getFecha();
		String tipo = "activo";
		double valor = registroCuenta.getValor();
		
		RegistroContable registroContable = new RegistroContable(descripcion, nombre, fecha, tipo, valor);
		
		baseDeDatos.getRegistrosContables().add(registroContable);
		
		return registroContable;
	}

	@Override
	public Balance calcularBalance(Date fechaInicio, Date fechaFin) {
		
		ArrayList<RegistroContable> registros = baseDeDatos.getRegistrosContables();
		
		double pasivosAcumulados = 0;
		double activosAcumulados = 0;
		
		for (RegistroContable reg: registros) {
			if (reg.getFecha().after(fechaInicio) && reg.getFecha().before(fechaFin)) {
				if (reg.getTipo() == "activo") {
					activosAcumulados += reg.getValor();
				} else if (reg.getTipo() == "pasivo") {
					pasivosAcumulados += reg.getValor();
				}
			} 
		}
		
		double patrimonio = activosAcumulados - pasivosAcumulados;
		
		return new Balance(fechaInicio, fechaFin, patrimonio);
	}

	
	
}
