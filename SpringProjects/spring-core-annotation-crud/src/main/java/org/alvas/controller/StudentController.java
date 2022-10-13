package org.alvas.controller;

import org.alvas.dto.Student;
import org.alvas.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentController {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		StudentService student1=(StudentService) applicationContext.getBean(null);
				
				Student student=(Student) applicationContext.getBean("mystudent");
				student.setId(99);
				System.out.println(student.getId());
				student.setName("Ananya");
				student.setEmail("ananyahs.2001@gmail.com");
				
				student1.saveStudent(student);
				System.out.println("main method started");
		
	}
}
