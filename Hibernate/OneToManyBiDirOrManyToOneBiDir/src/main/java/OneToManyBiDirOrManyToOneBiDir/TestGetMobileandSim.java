package OneToManyBiDirOrManyToOneBiDir;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetMobileandSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
	
//		Mobile m = em.find(Mobile.class, 1);
//		if(m!=null)
//		{
//			System.out.println("Mobile Id :"+m.getId());
//			System.out.println("Mobile Name :"+m.getName());
//			System.out.println("Mobile Brand :"+m.getBrand());
//		}
//		
//		List<Sim> list = m.getList1();
//		for(Sim s1:list)
//		{
//			System.out.println("Sim Id :"+s1.getId());
//			System.out.println("Service Provider :"+s1.getsP());
//			System.out.println("Sim Type :"+s1.getType());
//			System.out.println("----------------------------------------------");
//		}
		
		Sim s=em.find(Sim.class, 1);
		if(s!=null)
		{
			System.out.println("Sim Id :"+s.getId());
			System.out.println("Service Provider :"+s.getsP());
			System.out.println("Sim Type :"+s.getType());
			System.out.println("----------------------------------------------");
		}
		Mobile m = s.getM();
		if(m!=null)
		{
			System.out.println("Mobile Id :"+m.getId());
			System.out.println("Mobile Name :"+m.getName());
			System.out.println("Mobile Brand :"+m.getBrand());
		}
	}

}

