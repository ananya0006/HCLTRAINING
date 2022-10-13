package com.tutorial;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetMobileandSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		
		Mobile mob = em.find(Mobile.class, 1);
		
		if(mob!=null)
		{
			System.out.println("Mobile Id :"+mob.getid());
			System.out.println("Mobile Name :"+mob.getname());
			System.out.println("Mobile Brand :"+mob.getbrand());
			
			List<Sim> list =mob.getSim();
			for(Sim sim: list)
			{
				System.out.println("Sim Id :"+sim.getid());
				System.out.println("Service Provider :"+sim.getservicepro());
				System.out.println("Sim Type :"+sim.gettype());
				System.out.println("----------------------------------------------");
			}
		
		}
	}

}
