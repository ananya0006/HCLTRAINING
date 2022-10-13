package com.av.springbootsimple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassDemo {

	@GetMapping("/hello")
	public String getData() {
		return "Hii ise";
	}

	@GetMapping("/getstudent")
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Priya");
		student.setAge(21);
		return student;
	}

	@PostMapping("/savestudent")
	public String saveStudent(@RequestBody Student student) {
		if (student != null) {

			System.out.println("Student Id:" + student.getId());
			System.out.println("Student Id:" + student.getName());
			System.out.println("Student Id:" + student.getAge());
			
			return "Student Data is printed ,! view it in console ";
		} else {
			return null;
		}

	}
}
