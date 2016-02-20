package domain;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {

	private int id;
	private String name;
	private String mail;
	private int age;
	private Collection<Residence> residences = new ArrayList<Residence>();
	private Collection<Person> persons  = new ArrayList<Person>();
	
	
	public Person() {
		super();
	}

	public Person( String name, String mail, List<Residence> residences) {
		super();
		
		this.name = name;
		this.mail = mail;
		this.residences = residences;
	}
	
	public Person( String name, String mail, int age) {
		super();
		
		this.name = name;
		this.mail = mail;
		this.age =  age;		
	}

	@Id
    @GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@ManyToMany
	public Collection<Residence> getResidences() {
		return residences;
	}
	
	public void setResidences(List<Residence> residences) {
		this.residences = residences;
	}

	@ManyToMany
	public Collection<Person> getPersons() {
		return persons;
	}

	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	} 
	
}
