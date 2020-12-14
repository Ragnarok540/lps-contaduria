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


@RestController
public class ApiController {
	
	BaseDeDatos baseDeDatos;
	FacturaService facturaService;

	public ApiController(BaseDeDatos baseDeDatos,
			             FacturaService facturaService) {
		this.baseDeDatos = baseDeDatos;
		this.facturaService = facturaService;
	}

	@PostMapping("/registrar/factura/gasto")
	RegistroCuenta registrarFacturaGasto(@RequestBody Factura factura,
			                             @RequestParam String descripcion) {
		return facturaService.registrarCompraGasto(factura, descripcion);
	}
	
	@PostMapping("/registrar/factura/costo")
	RegistroCuenta registrarFacturaCosto(@RequestBody Factura factura,
			                             @RequestParam String descripcion) {
		return facturaService.registrarCompraCosto(factura, descripcion);
	}
	
	@PostMapping("/registrar/factura/ingreso")
	RegistroCuenta registrarFacturaIngreso(@RequestBody Factura factura,
			                               @RequestParam String descripcion) {
		return facturaService.registrarVenta(factura, descripcion);
	}
	
//
//	@PostMapping("/calculadora/restar")
//	Operations restar(@RequestBody Operations operations) {
//		return operationsService.restarEnteros(operations);
//	}
//
//	@PostMapping("/calculadora/multiplicar")
//	Operations multiplicar(@RequestBody Operations operations) {
//		return operationsService.multiplicarEnteros(operations);
//	}
//
	@GetMapping("/db")
	BaseDeDatos db() {
		return baseDeDatos;
	}

}
