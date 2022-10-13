package com.tutorial;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateMobileandSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Sim s1=em.find(Sim.class, 2);
		s1.setservicepro("IDEA");
		s1.settype("4G");
		
		Sim s2=em.find(Sim.class, 3);
		s2.setservicepro("JIO");
		s2.settype("2G");
		
		List<Sim> list = new ArrayList<Sim>();
		list.add(s1);
		list.add(s2);
		
		Mobile m = em.find(Mobile.class, 2);
		m.setname("VIVO");
		m.setbrand("VIVO");
		m.setSim(list);
		
		
		et.begin();
		em.merge(s1);
		em.merge(s2);
		em.merge(m);
		et.commit();
	
		System.out.println("data is updated");
	}
}
