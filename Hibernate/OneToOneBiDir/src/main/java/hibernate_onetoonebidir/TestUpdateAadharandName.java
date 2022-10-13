package hibernate_onetoonebidir;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateAadharandName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p1=em.find(Person.class, 1);
		p1.setName("Shrath");
		p1.setAge(28);
		
		Aadhar a1=em.find(Aadhar.class, 1);
		a1.setFatherName("Ravindra M Bangera");
		a1.setNo(82982821);
		
		p1.setR(a1);
		a1.setP(p1);
		
		et.begin();
		em.merge(p1);
		em.merge(a1);
		et.commit();
		
		System.out.println("Data updated");
	}

}
