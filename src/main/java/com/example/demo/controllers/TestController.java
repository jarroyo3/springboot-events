package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Persona;
import com.example.demo.services.PersonaService;

@RestController
@RequestMapping(value = "/v1/test")
public class TestController {

	@Autowired
	private PersonaService personaService;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Persona> getProductos() {

		return ResponseEntity.status(200).body(personaService.get());
	}

}
