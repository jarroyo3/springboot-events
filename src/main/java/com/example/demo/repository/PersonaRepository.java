package com.example.demo.repository;

import org.springframework.stereotype.Service;

import com.example.demo.models.Persona;

@Service
public class PersonaRepository {

	public void save(Persona persona) {
		System.out.println(String.format("Persona %s se ha guardado con exito", persona));
	}
}
