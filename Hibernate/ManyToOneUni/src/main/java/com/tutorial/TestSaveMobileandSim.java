package com.tutorial;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileandSim {

	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		mob.setName("MI A3");
		mob.setBrand("MI");
		
		Sim s1 = new Sim();
		s1.setservicepro("IDEA");
		s1.settype("4G");
		s1.setMob(mob);
		
		Sim s2 = new Sim();
		s2.setservicepro("BSNL");
		s2.settype("3G");
		s2.setMob(mob);
			
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(mob);
		et.commit();
	}
}
