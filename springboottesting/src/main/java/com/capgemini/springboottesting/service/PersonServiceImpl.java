package com.capgemini.springboottesting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springboottesting.dao.PersonDao;
import com.capgemini.springboottesting.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;
	
	@Override
	public Person addPerson(Person person) {
		return personDao.save(person);


	}

	@Override
	public Person findById(int personId) {
		return personDao.findById(personId).get();
	}
}
