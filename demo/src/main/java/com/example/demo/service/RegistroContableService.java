package com.example.demo.service;

import java.util.Date;

import com.example.demo.bean.Balance;
import com.example.demo.bean.RegistroContable;
import com.example.demo.bean.RegistroCuenta;

public interface RegistroContableService {

	public RegistroContable registrarPasivo(RegistroCuenta registroCuenta, String nombre);
	
	public RegistroContable registrarActivo(RegistroCuenta registroCuenta, String nombre);
	
	public Balance calcularBalance(Date fechaInicio, Date fechaFin); 
	
}
