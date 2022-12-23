package org.example.resources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.example.models.User;
import org.example.models.UserCredentials;
import org.example.services.UsernamePasswordValidator;
import org.glassfish.jersey.process.internal.RequestScoped;

@Path("auth")
@RequestScoped
public class AuthenticationResource {

//	@Inject
	private UsernamePasswordValidator usernamePasswordValidator;
//	TODO : authentication and generate the token
	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response authenticate(UserCredentials userCredentiels) {
//		TODO make authentication
		
		// TODO validate credetiel
		usernamePasswordValidator = new UsernamePasswordValidator();
		User user = usernamePasswordValidator.validateCredentiels(userCredentiels.getUsername(), userCredentiels.getPassword());
		// create token
		
		// set the token to autenticated user
		return Response.ok("hello").build();
	}
	
//	TODO : authentication and regenerate the token
	@POST
	@Path("refresh")
	public Response updateAuthenticate() {
//		TODO make authentication
		return Response.ok("hello").build();
	}
}
