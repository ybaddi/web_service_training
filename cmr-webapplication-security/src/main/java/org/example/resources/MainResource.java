package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("main")
public class MainResource {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMain(){
		return "work good";
	}
}
