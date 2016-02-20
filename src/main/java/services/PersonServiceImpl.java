package services;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import domain.Person;
import domain.Residence;

public class PersonServiceImpl implements PersonService {

	

	public void addPerson(Person p) {

		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		t.begin();
		EntityManagerHelper.getEntityManager().persist(p);
		System.err.println(p.getName());
		t.commit();

	}

	public void removePersonById(int id) {
		String s = "delete FROM Person as e where e.id=:id";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Person.class);
		q.setParameter("id", id);
		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		t.begin();
		t.commit();
	}

	public Person getPersonById(int id) {
		String s = "Select e FROM Person as e where e.id=:id";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Person.class);
		q.setParameter("id", id);
		Person res = (Person) q.getSingleResult();
		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		t.begin();
		t.commit();
		return res;
	}

	public List<Person> getAllPerson() {
		String s = "Select e FROM Person as e";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Person.class);
		List<Person> res = q.getResultList();
		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		t.begin();
		t.commit();
		return res;
	}

	public List<Residence> getResidence(int id) {
		String s = "Select e.residence FROM Person as e where e.id=:id";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Person.class);
		q.setParameter("id", id);
		List<Residence> res = q.getResultList();
		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		t.begin();
		t.commit();
		return res;
	}

}
