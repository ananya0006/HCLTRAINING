package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Person;


public class TestPerson {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring2.xml");
	Person person =  (Person) applicationContext.getBean("person");
	 person.savePerson(06, "ananya", 21);
	 person.getPerson();
	
	
}
}
