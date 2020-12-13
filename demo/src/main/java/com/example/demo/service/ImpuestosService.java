package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;

import com.example.demo.bean.DeclaracionDeRenta;
import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroContable;

public interface ImpuestosService {

	public double calcularIva(ArrayList<Factura> facturas, Date fechaInicio, Date fechaFin);
	
	public double calcularRetefuente(ArrayList<Factura> facturas, Date fechaInicio, Date fechaFin);
	
	public DeclaracionDeRenta generarDeclaracionDeRenta(ArrayList<RegistroContable> registros);
	
}
