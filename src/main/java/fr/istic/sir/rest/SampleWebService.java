package fr.istic.sir.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import domain.Heater;
import domain.Residence;

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
	public Residence getHome() {
		Residence h = new Residence();
		h.setSize(3000);
		Heater h1 = new Heater();
		h1.setName("500w");
		Heater h2 = new Heater();
		h2.setName("600w");
		ArrayList<Heater> list = new ArrayList<Heater>();
		list.add(h1);
		list.add(h2);
		h.setHeater(list);
		return h;
	}

}
