package jpa;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import domain.Person;
import domain.Residence;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {

			Person p = new Person();
			p.setName("martin");
			manager.persist(p);
			
			Person p2 = new Person();
			p2.setName("jean");
			manager.persist(p2);
			
			ArrayList<Person> l = new ArrayList<Person>();
			l.add(p);
			Residence r = new Residence(2, 52, null, null, l);
			p.getResidences().add(r);
			manager.persist(r);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		String s = "SELECT e FROM Person as e where e.name=:name";
		String s2= "SELECT r FROM Residence as r";

		Query q = manager.createQuery(s, Person.class);
		q.setParameter("name", "martin");
		List<Person> res = q.getResultList();
		
		System.err.println(res.size());
		System.err.println(res.get(0).getName());
		
		Query q2 = manager.createQuery(s2, Residence.class);
		List<Residence> res2 = q2.getResultList();
		
		System.err.println(res2.size());
		System.err.println(res2.get(0).getNbPiece());
		
		

		manager.close();
		factory.close();
	}

}
