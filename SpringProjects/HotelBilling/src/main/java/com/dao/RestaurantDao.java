package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Restaurant;

public class RestaurantDao {

	Restaurant r=new Restaurant();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ananya");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Restaurant saveFood(Restaurant restaurant) {
		
		et.begin();
		em.persist(restaurant);
		et.commit();
		return restaurant;
		
	}
}
