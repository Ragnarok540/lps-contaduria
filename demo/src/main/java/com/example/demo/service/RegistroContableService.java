package com.example.demo.service;

import com.example.demo.bean.Balance;
import com.example.demo.bean.RegistroContable;
import com.example.demo.bean.RegistroCuenta;

public interface RegistroContableService {

	public RegistroContable registrarPasivo(RegistroCuenta regitroCuenta, String nombre);
	
	public RegistroContable registrarActivo(RegistroCuenta regitroCuenta, String nombre);
	
	public Balance calcularBalance(); 
	
}
