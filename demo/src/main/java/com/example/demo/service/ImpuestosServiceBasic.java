package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;

import com.example.demo.bean.BaseDeDatos;
import com.example.demo.bean.DeclaracionDeRenta;
import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroCuenta;

import org.springframework.stereotype.Service;

@Service
public class ImpuestosServiceBasic implements ImpuestosService {

	BaseDeDatos baseDeDatos;
	
	public ImpuestosServiceBasic(BaseDeDatos baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}
	
	@Override
	public double calcularIva(Date fechaInicio, Date fechaFin) {
		double ivaAcumulado = 0;
		
		ArrayList<Factura> facturas = baseDeDatos.getFacturas();
		
		for (Factura fact: facturas) {
			
			if (fact.getFecha().after(fechaInicio) && fact.getFecha().before(fechaFin)) {
				ivaAcumulado += fact.getIva();
			} 

		}
		
		return ivaAcumulado;
	}

	@Override
	public double calcularRetefuente(Date fechaInicio, Date fechaFin) {
		double reteFuenteAcumulado = 0;
		
		ArrayList<Factura> facturas = baseDeDatos.getFacturas();
		
		for (Factura fact: facturas) {
			
			if (fact.getFecha().after(fechaInicio) && fact.getFecha().before(fechaFin)) {
				reteFuenteAcumulado += fact.getReteFuente();
			} 

		}
		
		return reteFuenteAcumulado;
	}

	@Override
	public DeclaracionDeRenta generarDeclaracionDeRenta() {
		
		ArrayList<RegistroCuenta> registros = baseDeDatos.getRegistrosCuenta();
		
		// TODO Auto-generated method stub
		
		// ingresos - intereses hipotecarios - gastos = base gravable if menos de (35 millones) else base gravable por * 33%
		// 
		// 
		
		return null;
	}

}
