package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	Aadhar a;
	public void details() {
		System.out.println("anu");
		a.number();
	}
}
