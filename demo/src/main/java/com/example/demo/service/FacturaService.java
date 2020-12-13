package com.example.demo.service;

import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroCuenta;

public interface FacturaService {

	public RegistroCuenta registrarCompra(Factura factura);
	
	public RegistroCuenta registrarVenta(Factura factura);
	
}
