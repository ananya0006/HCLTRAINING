package com.ManyToManyBiDir;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacherandSubject {

	public static void main(String[] args) {
		
		Subject s1=new Subject();
		s1.setSname("JAVA");
		s1.setDuration(2);
		
		Subject s2=new Subject();
		s2.setSname("C");
		s2.setDuration(5);
		
		Subject s3=new Subject();
		s3.setSname("C++");
		s3.setDuration(3);

		List<Subject> list1=new ArrayList<Subject>();
		list1.add(s1);
		list1.add(s3);
		
		Teacher t1=new Teacher();
		t1.setSub(list1);
		t1.setName("Sharan");
		t1.setSalary(45000);
		
		List<Subject> list2 = new ArrayList<Subject>();
		list2.add(s1);
		list2.add(s2);
		
		Teacher t2 = new Teacher();
		t2.setSub(list2);
		t2.setName("Pradeep");
		t2.setSalary(30000);
		
		List<Teacher> list3=new ArrayList<Teacher>();
		list3.add(t1);
		list3.add(t2);
		
		List<Teacher> list4=new ArrayList<Teacher>();
		list4.add(t2);
		
		List<Teacher> list5 = new ArrayList<Teacher>();
		list5.add(t1);
		
		s1.setTeach(list3);
		s1.setTeach(list4);
		s1.setTeach(list5);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(t1);
		em.persist(t2);
		et.commit();
	}

}
