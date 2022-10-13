package com.spring;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

public class J2EEContainerStdnt {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Student stu =(Student) applicationContext.getBean("pen1");
		stu.display();
	}
	}


