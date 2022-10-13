package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Student;

public class TestStudentCDI {
	
public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring4.xml");
	Student student = (Student) applicationContext.getBean("mystudent");
	student.display();
	
	}
}
