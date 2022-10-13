package com.tutorial;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllMobileandSim {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select m from Mobile m");
		
		List<Mobile> mobl = q.getResultList();
		
		for(Mobile mob: mobl)
		{
			System.out.println("Mobile Id :"+mob.getid());
			System.out.println("Mobile Name :"+mob.getname());
			System.out.println("Mobile Brand :"+mob.getbrand());
		
			List<Sim> sim = mob.getSim();
		
			for(Sim s: sim)
			{
				System.out.println("Sim Id :"+s.getid());
				System.out.println("Service Provider :"+s.getservicepro());
				System.out.println("Sim Type :"+s.gettype());
				System.out.println("---------------------------------------");
			}
		}
		
	}

}
