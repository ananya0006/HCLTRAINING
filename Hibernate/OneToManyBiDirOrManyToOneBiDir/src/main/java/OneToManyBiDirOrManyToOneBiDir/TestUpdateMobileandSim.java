package OneToManyBiDirOrManyToOneBiDir;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateMobileandSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Sim s1=em.find(Sim.class, 1);
		s1.setsP("JIO");
		s1.setType("2G");
		
		Sim s2=em.find(Sim.class, 2);
		s2.setsP("DOCOMO");
		s2.setType("3G");

		List<Sim> s = new ArrayList<Sim>();
		s.add(s1);
		s.add(s2);
		
		Mobile m=em.find(Mobile.class, 1);
		m.setName("VIVO V11");
		m.setBrand("VIVO");
		
		et.begin();
		em.merge(s1);
		em.merge(s2);
		em.merge(m);
		et.commit();
		System.out.println("UPDATED");
		
	}

}
