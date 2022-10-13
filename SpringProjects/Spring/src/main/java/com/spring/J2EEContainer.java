package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class J2EEContainer {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
	Pen pen =(Pen) applicationContext.getBean("pen1");
	pen.display();
}
}
