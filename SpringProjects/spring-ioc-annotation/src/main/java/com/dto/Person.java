package com.dto;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	int id;
	String name;
	int age;
	
	public void savePerson(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void getPerson()	{
		System.out.println("Person Id :"+id);
		System.out.println("Person name :"+name);
		System.out.println("Person age :"+age);
		
		
		}
}
