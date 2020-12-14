package com.example.demo.bean;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class BaseDeDatos {

	private ArrayList<Factura> facturas;	
	private ArrayList<RegistroContable> registrosContables;
	private ArrayList<RegistroCuenta> registrosCuenta;
	
	public BaseDeDatos(ArrayList<Factura> facturas,
			           ArrayList<RegistroContable> registrosContables, 
			           ArrayList<RegistroCuenta> registrosCuenta) {
		this.facturas = facturas;
		this.registrosContables = registrosContables;
		this.registrosCuenta = registrosCuenta;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public ArrayList<RegistroContable> getRegistrosContables() {
		return registrosContables;
	}

	public void setRegistrosContables(ArrayList<RegistroContable> registrosContables) {
		this.registrosContables = registrosContables;
	}

	public ArrayList<RegistroCuenta> getRegistrosCuenta() {
		return registrosCuenta;
	}

	public void setRegistrosCuenta(ArrayList<RegistroCuenta> registrosCuenta) {
		this.registrosCuenta = registrosCuenta;
	}
	
}
