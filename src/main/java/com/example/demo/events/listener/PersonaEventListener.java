package com.example.demo.events.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.example.demo.events.SavePersonaEvent;
import com.example.demo.models.Persona;
import com.example.demo.repository.PersonaRepository;

@Component
public class PersonaEventListener {

	@Autowired
	private PersonaRepository personaRepo;

	@Async
	@EventListener
	public void handleSavePersona(SavePersonaEvent personaEvent) throws InterruptedException {

		Thread.sleep(3000);

		System.out.println("Received event savePersonaHandles  " + personaEvent.getMessage());

		personaRepo.save((Persona) personaEvent.getSource());

		System.out.println("Persona object has been saved after execute save()" + personaEvent);
	}
}
