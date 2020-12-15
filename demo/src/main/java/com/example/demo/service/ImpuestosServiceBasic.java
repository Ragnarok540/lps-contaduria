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
	public DeclaracionDeRenta generarDeclaracionDeRenta(Date fechaInicio, Date fechaFin) {
		ArrayList<RegistroCuenta> registros = baseDeDatos.getRegistrosCuenta();
		
		double ingresosAcumulados = 0;
		double gastosAcumulados = 0;
		
		for (RegistroCuenta reg: registros) {
			if (reg.getFecha().after(fechaInicio) && reg.getFecha().before(fechaFin)) {
				if (reg.getTipo() == "ingreso") {
					ingresosAcumulados += reg.getValor();
				} else if (reg.getTipo() == "gasto") {
					gastosAcumulados += reg.getValor();
				}
			} 
		}
		
		double baseGravable = ingresosAcumulados /* - interesesHipotecarios */ - gastosAcumulados;
				
		double saldoPagar = 0;
		
		if (ingresosAcumulados > 35000000) {
			saldoPagar = baseGravable * 0.33;
		} 
				
		return new DeclaracionDeRenta(fechaInicio, fechaFin, saldoPagar);
	}

}
