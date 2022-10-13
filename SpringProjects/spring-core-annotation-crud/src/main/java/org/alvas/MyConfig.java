package org.alvas;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="org.alvas")
public class MyConfig {
	@Bean
	public EntityManagerFactory getEntityManangerFactory() {
		EntityManagerFactory entityManangerFactory =Persistence.createEntityManagerFactory(null);
		return entityManangerFactory;
	}

}
