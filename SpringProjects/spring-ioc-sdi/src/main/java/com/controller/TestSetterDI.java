package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Teacher;

public class TestSetterDI {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring3.xml");
		Teacher teacher = (Teacher) applicationContext.getBean("myteacher");
		teacher.display();

	}

}
