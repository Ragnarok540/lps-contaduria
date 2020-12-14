package com.example.demo.bean;

import java.util.Date;

public class Factura {

	private String codigo;
	private Date fecha;
	private double valor;
	private String tipo;
	private double iva;
	private String medioDePago;
	private double reteFuente;
	
	public Factura() {}
	
	public Factura(String codigo,
			       Date fecha,
			       double valor,
			       String tipo,
			       double iva,
			       String medioDePago,
			       double reteFuente) {
		this.codigo = codigo;
		this.fecha = fecha;
		this.valor = valor;
		this.tipo = tipo;
		this.iva = iva;
		this.medioDePago = medioDePago;
		this.reteFuente = reteFuente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public double getReteFuente() {
		return reteFuente;
	}

	public void setReteFuente(double reteFuente) {
		this.reteFuente = reteFuente;
	}
	
}
