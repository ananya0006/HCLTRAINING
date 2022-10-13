package hibernate_onetoonebidir;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetAadharandPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		
		Aadhar a=em.find(Aadhar.class, 1);
		if(a!=null)
		{
			System.out.println("Aadhar id:"+a.getId());
			System.out.println("Father Name:"+a.getFatherName());
			System.out.println("Aadhar no:"+a.getNo());
		}
		Person p1=a.getP();
		if(p1!=null)
		{
			System.out.println("Person id:"+p1.getId());
			System.out.println("Person Name:"+p1.getName());
			System.out.println("Person age:"+p1.getAge());
		}

	}

}
