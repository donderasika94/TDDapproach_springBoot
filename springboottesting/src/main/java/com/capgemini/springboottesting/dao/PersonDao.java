package com.capgemini.springboottesting.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.springboottesting.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
