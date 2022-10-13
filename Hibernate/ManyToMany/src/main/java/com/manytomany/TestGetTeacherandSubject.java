package com.manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetTeacherandSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		
		Teacher t = em.find(Teacher.class, 1);
		
		if(t!=null)
		{
			System.out.println("Teacher Id :"+t.getId());
			System.out.println("Teacher Name :"+t.getName());
			System.out.println("Teacher Salary :"+t.getSub());
			System.out.println("==================================");
		}

		List<Subject> sub=t.getSub();
		for(Subject s:sub)
		{
			System.out.println("Subject id :"+s.getId());
			System.out.println("Subject Name:"+s.getSname());
			System.out.println("Duration :"+s.getDuration());
			System.out.println("----------------------------------------------");
		} 
		
		
	}

}
