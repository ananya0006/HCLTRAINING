package hibernate_onetoonebidir;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetNameandAadhar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		
		Person p1=em.find(Person.class, 1);
		if(p1!=null)
		{
			System.out.println("Person id:"+p1.getId());
			System.out.println("Person Name:"+p1.getName());
			System.out.println("Person age:"+p1.getAge());
		}

		Aadhar a1=p1.getR();
		if(a1!=null)
		{
			System.out.println("Aadhar id:"+a1.getId());
			System.out.println("Father Name:"+a1.getFatherName());
			System.out.println("Aadhar no:"+a1.getNo());
		}
	}

}
