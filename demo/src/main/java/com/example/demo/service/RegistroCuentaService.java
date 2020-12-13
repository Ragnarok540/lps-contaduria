package com.example.demo.service;

import com.example.demo.bean.Factura;

public interface RegistroCuentaService {

	public boolean registrarCosto(Factura factura, String descripcion);
	
	public boolean registrarGasto(Factura factura, String descripcion);
	
	public boolean registrarIngreso(Factura factura, String descripcion);
	
}
