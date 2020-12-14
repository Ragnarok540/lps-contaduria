package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.bean.BaseDeDatos;
import com.example.demo.bean.RegistroCuenta;

@Service
public class RegistroCuentaServiceBasic implements RegistroCuentaService {

	private BaseDeDatos baseDeDatos;
	
	public RegistroCuentaServiceBasic(BaseDeDatos baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}
	
	@Override
	public boolean registrarCosto(RegistroCuenta registroCuenta) {
		registroCuenta.setTipo("costo");
		return baseDeDatos.getRegistrosCuenta().add(registroCuenta);
	}

	@Override
	public boolean registrarGasto(RegistroCuenta registroCuenta) {
		registroCuenta.setTipo("gasto");
		return baseDeDatos.getRegistrosCuenta().add(registroCuenta);
	}

	@Override
	public boolean registrarIngreso(RegistroCuenta registroCuenta) {
		registroCuenta.setTipo("ingreso");
		return baseDeDatos.getRegistrosCuenta().add(registroCuenta);
	}

}
