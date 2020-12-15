package com.example.demo.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.GeneradorDeDatosService;

@Component
public class RegistrationComponent implements CommandLineRunner {

	GeneradorDeDatosService generadorDeDatosService;
		
	public RegistrationComponent(GeneradorDeDatosService generadorDeDatosService) {
		this.generadorDeDatosService = generadorDeDatosService;
	}
	
	@Override
	public void run(@SuppressWarnings("unused") String... args) throws Exception {
		generadorDeDatosService.registrarDatosPruebas();
	}
	
}
