package OneToManyBiDirOrManyToOneBiDir;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileandSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sim s1 = new Sim();
		s1.setsP("IDEA");
		s1.setType("4G");
		
		Sim s2 = new Sim();
		s2.setsP("VODAPHONE");
		s2.setType("3G");
		
		List<Sim> list = new ArrayList<Sim>();
		list.add(s1);
		list.add(s2);
		
		Mobile mob = new Mobile();
		mob.setName("REDMI");
		mob.setBrand("MI");
		mob.setList1(list);

		s1.setM(mob);
		s2.setM(mob);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ananya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(mob);
		et.commit();
	}

}
