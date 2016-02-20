package domain;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class Residence {

	private int id;
	private int nbPiece;
	private int size;
	private Collection<Heater> heater = new ArrayList<Heater>();
	private Collection<ElectronicDevice> electronicDevice = new ArrayList<ElectronicDevice>();
	private Collection<Person> person = new ArrayList<Person>();

	public Residence() {
		// TODO Auto-generated constructor stub
	}

	public Residence(int nbPiece, int size, List<Heater> heater, List<ElectronicDevice> electronicDevice,
			List<Person> person) {
		super();
		this.nbPiece = nbPiece;
		this.size = size;
		this.heater = heater;
		this.electronicDevice = electronicDevice;
		this.person = person;
	}

	public Residence(int nbPiece, int size) {
		super();
		this.nbPiece = nbPiece;
		this.size = size;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@OneToMany
	@JoinColumn(name = "RESIDENCE_ID")
	public Collection<Heater> getHeater() {
		return heater;
	}

	public void setHeater(List<Heater> heater) {
		this.heater = heater;
	}

	@OneToMany
	@JoinColumn(name = "RESIDENCE_ID")
	public Collection<ElectronicDevice> getElectronicDevice() {
		return electronicDevice;
	}

	public void setElectronicDevice(List<ElectronicDevice> electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@ManyToMany(mappedBy = "residences")
	@XmlTransient
	public Collection<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

}
