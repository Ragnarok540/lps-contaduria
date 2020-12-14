package com.example.demo.bean;

import java.util.Date;

public class DeclaracionDeRenta {

	private Date fechaInicio;
	private Date fechaFin;
	private double saldoPagar;
	private double anticipo;
	private double saldoFavor;

	public DeclaracionDeRenta() {}
	
	public DeclaracionDeRenta(Date fechaInicio,
			                  Date fechaFin,
			                  double saldoPagar,
			                  double anticipo,
			                  double saldoFavor) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.saldoPagar = saldoPagar;
		this.anticipo = anticipo;
		this.saldoFavor = saldoFavor;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getSaldoPagar() {
		return saldoPagar;
	}

	public void setSaldoPagar(double saldoPagar) {
		this.saldoPagar = saldoPagar;
	}

	public double getAnticipo() {
		return anticipo;
	}

	public void setAnticipo(double anticipo) {
		this.anticipo = anticipo;
	}

	public double getSaldoFavor() {
		return saldoFavor;
	}

	public void setSaldoFavor(double saldoFavor) {
		this.saldoFavor = saldoFavor;
	}
	
}
