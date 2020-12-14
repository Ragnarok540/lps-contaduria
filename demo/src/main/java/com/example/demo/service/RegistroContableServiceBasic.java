package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;

import com.example.demo.bean.Balance;
import com.example.demo.bean.BaseDeDatos;
import com.example.demo.bean.RegistroContable;
import com.example.demo.bean.RegistroCuenta;

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
	public Balance calcularBalance(ArrayList<RegistroContable> registros) {
		// TODO Auto-generated method stub
		
		// calcular el patrimonio
		
		// activo - pasivo = patrimonio
		
		return null;
	}

	
	
}
