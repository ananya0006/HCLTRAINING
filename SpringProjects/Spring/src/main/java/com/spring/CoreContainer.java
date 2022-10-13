package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CoreContainer {

	public static void main(String[] args) {
		ClassPathResource classPathResource =new ClassPathResource("myspring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		Pen pen =(Pen) beanFactory.getBean("pen1");
		pen.display();
	}
}
