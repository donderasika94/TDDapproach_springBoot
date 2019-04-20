package com.capgemini.springboottesting.service;

import com.capgemini.springboottesting.entity.Person;

public interface PersonService {
	
	public Person addPerson(Person person);
	public Person findById(int personId);


}
