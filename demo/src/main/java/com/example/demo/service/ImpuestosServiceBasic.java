package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;

import com.example.demo.bean.DeclaracionDeRenta;
import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroContable;

import org.springframework.stereotype.Service;

@Service
public class ImpuestosServiceBasic implements ImpuestosService {

	@Override
	public double calcularIva(ArrayList<Factura> facturas, Date fechaInicio, Date fechaFin) {
		double ivaAcumulado = 0;
		
		for (Factura fact: facturas) {
			
			if (fact.getFecha().after(fechaInicio) && fact.getFecha().before(fechaFin)) {
				ivaAcumulado += fact.getIva();
			} 

		}
		
		return ivaAcumulado;
	}

	@Override
	public double calcularRetefuente(ArrayList<Factura> facturas, Date fechaInicio, Date fechaFin) {
		double reteFuenteAcumulado = 0;
		
		for (Factura fact: facturas) {
			
			if (fact.getFecha().after(fechaInicio) && fact.getFecha().before(fechaFin)) {
				reteFuenteAcumulado += fact.getReteFuente();
			} 

		}
		
		return reteFuenteAcumulado;
	}

	@Override
	public DeclaracionDeRenta generarDeclaracionDeRenta(ArrayList<RegistroContable> registros) {
		// TODO Auto-generated method stub
		
		// ingresos - intereses hipotecarios - gastos = base gravable if menos de (35 millones) else base gravable por * 33%
		// 
		// 
		
		return null;
	}

}
