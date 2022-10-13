package OneToManyBiDirOrManyToOneBiDir;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllMobileandSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		//Query q = em.createQuery("select m from Mobile m");
		
//		List<Mobile> m = q.getResultList();
//		for(Mobile mob:m)
//		{
//			System.out.println("Mobile Id :"+mob.getId());
//			System.out.println("Mobile Name :"+mob.getName());
//			System.out.println("Mobile Brand :"+mob.getBrand());
//			
//			List<Sim> s = mob.getList1();
//			for(Sim sim:s)
//			{
//				System.out.println("Sim Id :"+sim.getId());
//				System.out.println("Service Provider :"+sim.getsP());
//				System.out.println("Sim Type :"+sim.getType());
//				System.out.println("---------------------------------------");
//			}
//		}
		
		Query  q=em.createQuery("Select s from Sim s");
		List<Sim> sim = q.getResultList();
		
		for(Sim s:sim)
		{
			System.out.println("Sim Id :"+s.getId());
			System.out.println("Service Provider :"+s.getsP());
			System.out.println("Sim Type :"+s.getType());
			System.out.println("---------------------------------------");
			
			Mobile mob=s.getM();
			if(mob!=null)
			{
				System.out.println("Mobile Id :"+mob.getId());
				System.out.println("Mobile Name :"+mob.getName());
				System.out.println("Mobile Brand :"+mob.getBrand());
			}
		}
		

	}

}
