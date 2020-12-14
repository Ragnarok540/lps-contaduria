package com.example.demo.service;

import java.util.Date;

import com.example.demo.bean.DeclaracionDeRenta;

public interface ImpuestosService {

	public double calcularIva(Date fechaInicio, Date fechaFin);
	
	public double calcularRetefuente(Date fechaInicio, Date fechaFin);
	
	public DeclaracionDeRenta generarDeclaracionDeRenta(Date fechaInicio, Date fechaFin);
	
}
