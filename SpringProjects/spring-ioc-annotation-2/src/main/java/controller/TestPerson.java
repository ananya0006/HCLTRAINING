package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.av.MyConfig;
import com.av.dto.Person;


public class TestPerson {

public static void main(String[] args) {

	      ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

	      Person per = (Person) context.getBean("person");

	      per.details();

	}
}

