package com.tutorial;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileandSim {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		
		Sim s= em.find(Sim.class, 2);
		if(s!=null)
		{
			System.out.println("Sim Id :"+s.getid());
			System.out.println("Service Provider :"+s.getservicepro());
			System.out.println("Sim Type :"+s.gettype());
			System.out.println("----------------------------------------------");
		}
		Mobile m = s.getMob();

		if(m!=null)
		{
			System.out.println("Mobile Id :"+m.getId());
			System.out.println("Mobile Name :"+m.getName());
			System.out.println("Mobile Brand :"+m.getBrand());
		}	
	}
}

