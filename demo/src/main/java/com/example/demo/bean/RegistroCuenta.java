package com.example.demo.bean;

import java.util.Date;

public class RegistroCuenta {

	private String descripcion;
	private String factura;
	private Date fecha;
	private String tipo;
	private double valor;
	
	public RegistroCuenta(String descripcion, String factura, Date fecha, String tipo, double valor) {
		this.descripcion = descripcion;
		this.factura = factura;
		this.fecha = fecha;
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
