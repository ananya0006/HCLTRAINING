package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Branch {
	
	public Address a;
	
	//using setter
	
	//@Autowired
	//public void setA(Address a) {
	//	this.a = a;
	//}
	
	
	//using constructor
	
	@Autowired
	public Branch(Address a) {
		super();
		this.a = a;
	}
	


	public void details() {
		System.out.println("ananya");
		
	}






}
