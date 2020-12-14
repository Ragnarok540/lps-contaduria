package com.example.demo.service;

import com.example.demo.bean.RegistroCuenta;

public interface RegistroCuentaService {

	public boolean registrarCosto(RegistroCuenta registroCuenta);
	
	public boolean registrarGasto(RegistroCuenta registroCuenta);
	
	public boolean registrarIngreso(RegistroCuenta registroCuenta);
	
}
