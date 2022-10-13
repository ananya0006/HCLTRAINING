package hibernate_onetoonebidir;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteAadharandPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Aadhar a1=em.find(Aadhar.class, 1);
		
		Person p1=a1.getP();
		et.begin();
		em.remove(a1);
		em.remove(p1);
		et.commit();
		
		System.out.println("Data deleted");
	}
}
