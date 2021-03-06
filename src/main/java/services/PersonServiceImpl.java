package services;

import java.util.Collection;

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
		
		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		t.begin();
		EntityManagerHelper.getEntityManager().remove(EntityManagerHelper.getEntityManager().find( Person.class,id));
		t.commit();
		EntityManagerHelper.closeEntityManager();
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

	public Collection<Person> getAllPerson() {
		String s = "Select r FROM Person as r";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Person.class);
		return q.getResultList();
		
	}

	public Collection<Residence> getResidence(int id) {
		String s = "Select e.residence FROM Person as e where e.id=:id";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Person.class);
		return  q.getResultList();
	}

}
