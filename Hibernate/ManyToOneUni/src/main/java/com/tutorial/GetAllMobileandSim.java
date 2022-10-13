package com.tutorial;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class GetAllMobileandSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select s from Sim s");
		
		List<Sim> s = q.getResultList();
		
		for(Sim sim:s)
		{
			System.out.println("Sim Id :"+sim.getid());
			System.out.println("Service Provider :"+sim.getservicepro());
			System.out.println("Sim Type :"+sim.gettype());
			System.out.println("---------------------------------------");
			
			Mobile m=sim.getMob();
			if(m!=null)
			{
				System.out.println("Mobile Id :"+m.getId());
				System.out.println("Mobile Name :"+m.getName());
				System.out.println("Mobile Brand :"+m.getBrand());
				System.out.println("====================================");
			}
		}

	}

}
