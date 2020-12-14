package com.example.demo.bean;

import java.util.Date;

public class DeclaracionDeRenta {

	private Date fechaInicio;
	private Date fechaFin;
	private double saldoPagar;

	public DeclaracionDeRenta() {}
	
	public DeclaracionDeRenta(Date fechaInicio,
			                  Date fechaFin,
			                  double saldoPagar) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.saldoPagar = saldoPagar;
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
	
}
