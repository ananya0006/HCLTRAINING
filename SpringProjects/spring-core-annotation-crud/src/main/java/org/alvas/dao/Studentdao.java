package org.alvas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.alvas.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Studentdao {
@Autowired
EntityManagerFactory entityManagerFactory ;
public Student saveStudent(Student student)
{
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(student);
	entityTransaction.commit();
	return student;
	
}
}
