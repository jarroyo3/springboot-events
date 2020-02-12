package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.example.demo.events.SavePersonaEvent;
import com.example.demo.models.Persona;

@Transactional
@Service
public class PersonaService {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public Persona get() {
		Persona persona = new Persona();
		persona.setNombre("Jorge");
		persona.setApellidos("Arroyo");
		persona.setEdad(30);

		applicationEventPublisher.publishEvent(new SavePersonaEvent(persona, "Objeto Evento Creado"));

		return persona;
	}
}
