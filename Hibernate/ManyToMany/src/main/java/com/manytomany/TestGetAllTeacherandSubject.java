package com.manytomany;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TestGetAllTeacherandSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select t from Teacher t");
		
		List<Teacher> t = q.getResultList();
		
		for(Teacher teach: t)
		{
			System.out.println("Teacher Id :"+teach.getId());
			System.out.println("Teacher Name :"+teach.getName());
			System.out.println("Teacher Salary :"+teach.getSalary());
			System.out.println("=========================================");
		
			List<Subject> sub = teach.getSub();
		
			for(Subject s: sub)
			{
				System.out.println("Subject Id :"+s.getId());
				System.out.println("Subject Name:"+s.getSname());
				System.out.println("Duration :"+s.getDuration());
				System.out.println("---------------------------------------");
			}
		}

	}

}
