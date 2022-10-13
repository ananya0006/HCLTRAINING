package com.tutorial;
//one to many
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileandSim {
	
	public static void main(String[] args) {
		
		Sim s1 = new Sim();
		s1.setservicepro("AIRTEL");
		s1.settype("4G");
		
		Sim s2 = new Sim();
		s2.setservicepro("JIO");
		s2.settype("3G");
		
		List<Sim> list = new ArrayList<Sim>();
		list.add(s1);
		list.add(s2);
		
		Mobile mob = new Mobile();
		mob.setname("MI A3");
		mob.setbrand("MI");
		
		mob.setSim(list);
		
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
