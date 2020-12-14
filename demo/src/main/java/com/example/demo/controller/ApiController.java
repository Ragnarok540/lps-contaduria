package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.BaseDeDatos;


@RestController
public class ApiController {
	
	

	BaseDeDatos baseDeDatos;

	public ApiController(BaseDeDatos baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}
//
//	@PostMapping("/calculadora/sumar")
//	Operations sumar(@RequestBody Operations operations) {
//		return operationsService.sumarEnteros(operations);
//	}
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
