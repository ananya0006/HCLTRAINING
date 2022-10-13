package hibernate_onetoonebidir;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAadharandPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		p1.setName("Anu");
		p1.setAge(22);
		
		Aadhar a1=new Aadhar();
		a1.setFatherName("Raju");
		a1.setNo(98880092);
		
		p1.setR(a1);
		a1.setP(p1);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(p1);
		em.persist(a1);
		et.commit();
	}

}
