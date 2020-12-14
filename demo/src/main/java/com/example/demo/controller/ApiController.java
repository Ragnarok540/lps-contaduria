package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.BaseDeDatos;
import com.example.demo.bean.Factura;
import com.example.demo.bean.RegistroCuenta;
import com.example.demo.service.FacturaService;
import com.example.demo.service.RegistroCuentaService;


@RestController
public class ApiController {
	
	BaseDeDatos baseDeDatos;
	FacturaService facturaService;
	RegistroCuentaService registroCuentaService;

	public ApiController(BaseDeDatos baseDeDatos,
			             FacturaService facturaService,
			             RegistroCuentaService registroCuentaService) {
		this.baseDeDatos = baseDeDatos;
		this.facturaService = facturaService;
		this.registroCuentaService = registroCuentaService;
	}

	@PostMapping("/registrar/factura/compra/gasto")
	RegistroCuenta registrarFacturaCompraGasto(@RequestBody Factura factura,
			                                   @RequestParam String descripcion) {
		return facturaService.registrarCompraGasto(factura, descripcion);
	}
	
	@PostMapping("/registrar/factura/compra/costo")
	RegistroCuenta registrarFacturaCompraCosto(@RequestBody Factura factura,
			                                   @RequestParam String descripcion) {
		return facturaService.registrarCompraCosto(factura, descripcion);
	}
	
	@PostMapping("/registrar/factura/ingreso")
	RegistroCuenta registrarFacturaIngreso(@RequestBody Factura factura,
			                               @RequestParam String descripcion) {
		return facturaService.registrarVenta(factura, descripcion);
	}
	
	@PostMapping("/registrar/cuenta/gasto")
	boolean registrarCuentaGasto(@RequestBody RegistroCuenta registroCuenta) {
		return registroCuentaService.registrarGasto(registroCuenta);
	}
	
	@PostMapping("/registrar/cuenta/costo")
	boolean registrarCuentaCosto(@RequestBody RegistroCuenta registroCuenta) {
		return registroCuentaService.registrarCosto(registroCuenta);
	}
	
	@PostMapping("/registrar/cuenta/ingreso")
	boolean registrarCuentaIngreso(@RequestBody RegistroCuenta registroCuenta) {
		return registroCuentaService.registrarIngreso(registroCuenta);
	}
	

	
	
	@GetMapping("/db")
	BaseDeDatos db() {
		return baseDeDatos;
	}

}
