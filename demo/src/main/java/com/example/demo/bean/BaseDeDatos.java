package com.example.demo.bean;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class BaseDeDatos {

	private ArrayList<Factura> facturas;	
	private ArrayList<RegistroContable> registros;
	private ArrayList<RegistroCuenta> registrosCuenta;
	
	public BaseDeDatos(ArrayList<Factura> facturas, ArrayList<RegistroContable> registros, ArrayList<RegistroCuenta> registrosCuenta) {
		this.facturas = facturas;
		this.registros = registros;
		this.registrosCuenta = registrosCuenta;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public ArrayList<RegistroContable> getRegistros() {
		return registros;
	}

	public void setRegistros(ArrayList<RegistroContable> registros) {
		this.registros = registros;
	}

	public ArrayList<RegistroCuenta> getRegistrosCuenta() {
		return registrosCuenta;
	}

	public void setRegistrosCuenta(ArrayList<RegistroCuenta> registrosCuenta) {
		this.registrosCuenta = registrosCuenta;
	}
	
}
