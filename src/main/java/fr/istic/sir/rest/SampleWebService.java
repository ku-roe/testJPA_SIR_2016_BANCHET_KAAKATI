package fr.istic.sir.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import domain.Heater;
import domain.Person;
import domain.Residence;
import services.PersonServiceImpl;
import services.ResidenceServiceImpl;

@Path("/hello")
public class SampleWebService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello, how are you?";
	}

	@GET
	@Path("/home")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Residence> getHome() {
		ResidenceServiceImpl h = new ResidenceServiceImpl();
		return h.getResidence();
	}
	
	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Person> getPersons() {
		PersonServiceImpl unepers = new PersonServiceImpl();
		return unepers.getAllPerson();
	}

}
