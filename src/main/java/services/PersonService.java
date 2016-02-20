package services;

import java.util.List;

import domain.*;

public interface PersonService {

	void addPerson(Person p);

	void removePersonById(int id);

	Person getPersonById(int id);

	List<Person> getAllPerson();

	List<Residence> getResidence(int id);

}
