package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HolaMundoServiceBasic implements HolaMundoService {

	@Override
	public void holaMundo() {
		System.out.print("Hola Mundo2");
		
	}

}
