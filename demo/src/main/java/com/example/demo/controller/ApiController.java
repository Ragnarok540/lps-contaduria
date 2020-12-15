package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Balance;
import com.example.demo.bean.BaseDeDatos;
import com.example.demo.bean.DeclaracionDeRenta;
import com.example.demo.bean.Factura;
import com.example.demo.bean.Propiedades;
import com.example.demo.bean.RegistroContable;
import com.example.demo.bean.RegistroCuenta;
import com.example.demo.service.FacturaService;
import com.example.demo.service.ImpuestosService;
import com.example.demo.service.RegistroContableService;
import com.example.demo.service.RegistroCuentaService;


@RestController
public class ApiController {
	
	BaseDeDatos baseDeDatos;
	Propiedades propiedades;
	FacturaService facturaService;
	RegistroCuentaService registroCuentaService;
	RegistroContableService registroContableService;
	ImpuestosService impuestosService;

	String nombreProducto;
	
	public ApiController(BaseDeDatos baseDeDatos,
			             Propiedades propiedades,
			             FacturaService facturaService,
			             RegistroCuentaService registroCuentaService,
			             RegistroContableService registroContableService,
			             ImpuestosService impuestosService) {
		this.baseDeDatos = baseDeDatos;
		this.propiedades = propiedades;
		this.facturaService = facturaService;
		this.registroCuentaService = registroCuentaService;
		this.registroContableService = registroContableService;
		this.impuestosService = impuestosService;
		
		this.nombreProducto = this.propiedades.getNombreproducto();
	}

	// RQ02
	@PostMapping("/registrar/factura/compra/gasto")
	RegistroCuenta registrarFacturaCompraGasto(@RequestBody Factura factura,
			                                   @RequestParam String descripcion) {
		return facturaService.registrarCompraGasto(factura, descripcion);
	}
	
	// RQ02
	@PostMapping("/registrar/factura/compra/costo")
	RegistroCuenta registrarFacturaCompraCosto(@RequestBody Factura factura,
			                                   @RequestParam String descripcion) {
		return facturaService.registrarCompraCosto(factura, descripcion);
	}
	
	// RQ03
	@PostMapping("/registrar/factura/ingreso")
	RegistroCuenta registrarFacturaIngreso(@RequestBody Factura factura,
			                               @RequestParam String descripcion) {
		return facturaService.registrarVenta(factura, descripcion);
	}
	
	// RQ05
	@PostMapping("/registrar/cuenta/costo")
	boolean registrarCuentaCosto(@RequestBody RegistroCuenta registroCuenta) {
		return registroCuentaService.registrarCosto(registroCuenta);
	}
	
	// RQ06
	@PostMapping("/registrar/cuenta/gasto")
	boolean registrarCuentaGasto(@RequestBody RegistroCuenta registroCuenta) {
		return registroCuentaService.registrarGasto(registroCuenta);
	}
	
	// RQ07
	@PostMapping("/registrar/cuenta/ingreso")
	boolean registrarCuentaIngreso(@RequestBody RegistroCuenta registroCuenta) {
		return registroCuentaService.registrarIngreso(registroCuenta);
	}
	
	// RQ08
	@PostMapping("/registrar/pasivo")
	RegistroContable registrarPasivo(@RequestBody RegistroCuenta registroCuenta,
			                         @RequestParam String nombre) {
		return registroContableService.registrarPasivo(registroCuenta, nombre);
	}
	
	// RQ09
	@PostMapping("/registrar/activo")
	RegistroContable registrarActivo(@RequestBody RegistroCuenta registroCuenta,
			                         @RequestParam String nombre) {
		return registroContableService.registrarActivo(registroCuenta, nombre);
	}	
	
	// RQ11
	@PostMapping("/balance")
	Balance balance(@RequestBody Balance balance) throws Exception {
		if (this.nombreProducto.equals("Microempresa")) {
			return registroContableService.calcularBalance(balance.getFechaInicio(), balance.getFechaFin());
		} else {
			throw new Exception("Funcionalidad del producto 'Microempresa'");
		}
	}
	
	// RQ12
	@PostMapping("/iva")
	double iva(@RequestBody Balance balance) throws Exception {
		if (this.nombreProducto.equals("Microempresa")) {
			return impuestosService.calcularIva(balance.getFechaInicio(), balance.getFechaFin());
		} else {
			throw new Exception("Funcionalidad del producto 'Microempresa'");
		}
	}
	
	// RQ14
	@PostMapping("/retefuente")
	double retefuente(@RequestBody Balance balance) throws Exception {
		if (this.nombreProducto.equals("Microempresa")) {
			return impuestosService.calcularRetefuente(balance.getFechaInicio(), balance.getFechaFin());
		} else {
			throw new Exception("Funcionalidad del producto 'Microempresa'");
		}
	}
	
	// RQ16
	@PostMapping("/declaracion")
	DeclaracionDeRenta declaracion(@RequestBody Balance balance) {
		return impuestosService.generarDeclaracionDeRenta(balance.getFechaInicio(), balance.getFechaFin());
	}	
	
	@GetMapping("/db")
	BaseDeDatos db() {
		return baseDeDatos;
	}

}
