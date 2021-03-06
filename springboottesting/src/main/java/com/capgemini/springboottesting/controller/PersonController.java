package com.capgemini.springboottesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboottesting.entity.Person;
import com.capgemini.springboottesting.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@PostMapping("/")
	public Person addPerson() {
		Person person = new Person(101,"Rasika");
		service.addPerson(person);
		return person;
	}
	
	@GetMapping("/byId/{personId}")
	public Person findById(@PathVariable int personId) {
		Person person = new Person(101,"Rasika");
		service.findById(101);
		return person;
	}

}
