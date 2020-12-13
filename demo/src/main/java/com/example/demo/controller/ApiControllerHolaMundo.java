package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HolaMundoService;

@RestController
public class ApiControllerHolaMundo {

	HolaMundoService holaMundoService;

	public ApiControllerHolaMundo(HolaMundoService holaMundoService) {
		this.holaMundoService = holaMundoService;
	}
	
	@GetMapping("/hola")
	void holaMundo() {
		this.holaMundoService.holaMundo();
		//return "ok";
	}
	
}
