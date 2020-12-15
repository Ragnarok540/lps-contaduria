package com.example.demo.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.bean.BaseDeDatos;
import com.example.demo.bean.Factura;
import com.example.demo.bean.Propiedades;
import com.example.demo.bean.RegistroCuenta;

@Service
public class GeneradorDeDatosServiceBasic implements GeneradorDeDatosService {

	BaseDeDatos baseDeDatos;
	Propiedades propiedades;
	FacturaService facturaService;
	RegistroContableService registroContableService;
		
	public GeneradorDeDatosServiceBasic(BaseDeDatos baseDeDatos,
			                            Propiedades propiedades,
			                            FacturaService facturaService,
			                            RegistroContableService registroContableService) {
		this.baseDeDatos = baseDeDatos;
		this.propiedades = propiedades;
		this.facturaService = facturaService;
		this.registroContableService = registroContableService;
	}

	@Override
	public void registrarDatosPruebas() {
		
		String nombreProducto = this.propiedades.getNombreproducto();
			
		if (nombreProducto.equals("Microempresa")) {
			datosMicroEmpresa();
		} else if (nombreProducto.equals("Personal")) {
			datosPersonal();
		}	
	}
	
	private void datosMicroEmpresa() {
		Factura factura1 = new Factura("1", new Date(), 100000, "compra", 10000, "efectivo", 10000);
		Factura factura2 = new Factura("2", new Date(), 200000, "compra", 20000, "efectivo", 20000);
		Factura factura3 = new Factura("3", new Date(), 300000, "venta", 30000, "efectivo", 30000);
		Factura factura4 = new Factura("4", new Date(), 400000, "venta", 40000, "tarjeta", 40000);
		Factura factura5 = new Factura("5", new Date(), 500000, "compra", 50000, "tarjeta", 50000);
		Factura factura6 = new Factura("6", new Date(), 60000000, "venta", 60000, "tarjeta", 60000);
		
		this.facturaService.registrarCompraCosto(factura1, "desc1");
		this.facturaService.registrarCompraCosto(factura2, "desc2");
		this.facturaService.registrarVenta(factura3, "desc3");
		this.facturaService.registrarVenta(factura4, "desc4");
		this.facturaService.registrarCompraGasto(factura5, "desc5");
		this.facturaService.registrarVenta(factura6, "desc6");
	}

	private void datosPersonal() {
		RegistroCuenta registroCuenta1 = new RegistroCuenta("desc1", "", new Date(), "ingreso", 10000);
		RegistroCuenta registroCuenta2 = new RegistroCuenta("desc2", "", new Date(), "gasto", 20000);
		RegistroCuenta registroCuenta3 = new RegistroCuenta("desc3", "", new Date(), "costo", 30000);
		RegistroCuenta registroCuenta4 = new RegistroCuenta("desc4", "", new Date(), "ingreso", 40000);
		RegistroCuenta registroCuenta5 = new RegistroCuenta("desc5", "", new Date(), "gasto", 50000);
		RegistroCuenta registroCuenta6 = new RegistroCuenta("desc6", "", new Date(), "costo", 60000);
		
		this.baseDeDatos.getRegistrosCuenta().add(registroCuenta1);
		this.baseDeDatos.getRegistrosCuenta().add(registroCuenta2);
		this.baseDeDatos.getRegistrosCuenta().add(registroCuenta3);
		this.baseDeDatos.getRegistrosCuenta().add(registroCuenta4);
		this.baseDeDatos.getRegistrosCuenta().add(registroCuenta5);
		this.baseDeDatos.getRegistrosCuenta().add(registroCuenta6);
		
		this.registroContableService.registrarActivo(registroCuenta1, "nombre1");
		this.registroContableService.registrarActivo(registroCuenta2, "nombre2");
		this.registroContableService.registrarActivo(registroCuenta3, "nombre3");
		this.registroContableService.registrarPasivo(registroCuenta4, "nombre4");
		this.registroContableService.registrarPasivo(registroCuenta5, "nombre5");
		this.registroContableService.registrarPasivo(registroCuenta6, "nombre6");
	}
	
}
