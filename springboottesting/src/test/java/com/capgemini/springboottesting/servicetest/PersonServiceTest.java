//package com.capgemini.springboottesting.servicetest;
//
//import static org.hamcrest.CoreMatchers.any;
//import static org.mockito.Mockito.doReturn;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.capgemini.springboottesting.dao.PersonDao;
//import com.capgemini.springboottesting.entity.Person;
//import com.capgemini.springboottesting.service.PersonService;
//
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//class PersonServiceTest {
//	
//	@Autowired
//	PersonService service;
//	
//	@MockBean
//	PersonDao dao;
//	
//
//	@Test
//	void testAddPerson() {
//		
//		Person mockPerson = new Person(101,"Rasika");
//		doReturn(mockPerson).when(dao).save(any());
//		Person returnedPerson = service.addPerson(mockPerson);
//		
//		Assertions.assertNotNull(returnedPerson, "The Saved product should not be null");
//		Assertions.assertEquals(101,returnedPerson.getPersonId())
//	
//	}
//
//
//	private Object any() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
