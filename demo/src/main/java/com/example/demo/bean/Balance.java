package com.example.demo.bean;

import java.util.Date;

public class Balance {

	private Date fechaInicio;
	private Date fechaFin;
	private double patrimonio;

	public Balance() {}
	
	public Balance(Date fechaInicio,
			       Date fechaFin,
			       double patrimonio) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.patrimonio = patrimonio;
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

	public double getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}
	
}
