package OneToManyBiDirOrManyToOneBiDir;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestdeleteMobileandSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Mobile m = em.find(Mobile.class, 1);
		
		List<Sim> s=m.getList1();
		et.begin();
		
		for(Sim sim:s)
		{
			em.remove(sim);
		}
		em.remove(m);
		et.commit();
		System.out.println("Data deleted");

	}

}
