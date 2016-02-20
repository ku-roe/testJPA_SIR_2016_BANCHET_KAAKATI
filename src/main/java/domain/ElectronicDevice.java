package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ElectronicDevice {

	private int id;
	private String name;
	private String nbWatt;

	public ElectronicDevice(int id, String name, String nbWatt) {
		super();
		this.id = id;
		this.name = name;
		this.nbWatt = nbWatt;
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

	public String getNbWatt() {
		return nbWatt;
	}

	public void setNbWatt(String nbWatt) {
		this.nbWatt = nbWatt;
	}

}
