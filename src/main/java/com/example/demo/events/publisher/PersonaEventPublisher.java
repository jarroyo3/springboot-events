package com.example.demo.events.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.demo.events.SavePersonaEvent;

@Component
@Deprecated
public class PersonaEventPublisher {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void savePersonaAndPublishEvent(final String message) {
		System.out.println("Publishing custom event. ");
		SavePersonaEvent customSpringEvent = new SavePersonaEvent(this, message);
		applicationEventPublisher.publishEvent(customSpringEvent);
	}
}
