package com.example.demo.service;

import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroCuenta;

public interface FacturaService {

	public RegistroCuenta registrarCompraGasto(Factura factura, String descripcion);
	
	public RegistroCuenta registrarCompraCosto(Factura factura, String descripcion);
		
	public RegistroCuenta registrarVenta(Factura factura, String descripcion);
	
}
