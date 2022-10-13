package com.tutorial;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateSimandMobile {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//Mobile m = em.find(Mobile.class, 2);
		Mobile m = em.find(Mobile.class, 1);
		m.setName("OPPO");
		m.setBrand("OPPO");
		
		Sim s = em.find(Sim.class, 1);
		s.setservicepro("JIO");
		s.settype("2G");
		
		et.begin();
		em.merge(m);
		em.merge(s);
		et.commit();
		
		System.out.println("data is updated");

	}

}
