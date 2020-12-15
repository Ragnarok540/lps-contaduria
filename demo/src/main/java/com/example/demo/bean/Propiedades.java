package com.example.demo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.example.demo.components.Variables;

@Service
public class Propiedades {

	private String nombreproducto;

	public Propiedades() {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		Variables variables = appContext.getBean(Variables.class);
		this.nombreproducto = variables.getNombreproducto();
		((ClassPathXmlApplicationContext) appContext).close();
		
	}

	public String getNombreproducto() {
		return nombreproducto;
	}

	public void setNombreproducto(String nombreaplicacion) {
		this.nombreproducto = nombreaplicacion;
	}
	
}
