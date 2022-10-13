package hibernate_onetoonebidir;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllAadharandName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		
		Query q=em.createQuery("select r from Aadhar r");
		List<Aadhar> list=q.getResultList();
		for(Aadhar a1:list)
		{
			System.out.println("Aadhar id:"+a1.getId());
			System.out.println("Father Name:"+a1.getFatherName());
			System.out.println("Aadhar no:"+a1.getNo());
		
			Person p1=a1.getP();
			if(p1!=null)
			{
				System.out.println("Person id:"+p1.getId());
				System.out.println("Person Name:"+p1.getName());
				System.out.println("Person age:"+p1.getAge());

			}	
		}
		
	}

}
