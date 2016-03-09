package services;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import domain.Person;
import domain.Residence;

public class ResidenceServiceImpl implements ResidenceService {



	public void addResidence(int nbPiece, int size) {
		Residence r = new Residence(nbPiece, size);
		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		t.begin();
		EntityManagerHelper.getEntityManager().persist(r);
		t.commit();

	}

	public void removeResidence(int id) {
		String s = "delete FROM Residence as r where r.id=:id";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Residence.class);
		q.setParameter("id", id);
		EntityTransaction t = EntityManagerHelper.getEntityManager().getTransaction();
		t.begin();
		t.commit();

	}

	public Collection<Residence> getResidence() {

		String s = "Select r FROM Residence as r";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Residence.class);
		return q.getResultList();
		
	}

	public Collection<Residence> getResidence(int id) {

		String s = "Select r FROM Residence as r where r.id=:id";
		Query q = EntityManagerHelper.getEntityManager().createQuery(s, Residence.class);
		q.setParameter("id", id);
		return q.getResultList();
		
	}

}
