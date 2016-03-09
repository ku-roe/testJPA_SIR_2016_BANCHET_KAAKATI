package services;

import java.util.Collection;
import java.util.List;

import domain.*;

public interface PersonService {

	void addPerson(Person p);

	void removePersonById(int id);

	Person getPersonById(int id);

	Collection<Person> getAllPerson();

	Collection<Residence> getResidence(int id);

}
