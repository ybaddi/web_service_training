package org.example.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.example.models.User;


@ApplicationScoped
public class UsernamePasswordValidator {

//	@Inject
	private UserService userService;

	public User validateCredentiels(String username, String password) {
		// TODO Auto-generated method stub
	
		// TODO get user
		 userService = new UserService();
		User user = userService.findByUsernameOrEmail(username);
		System.out.println("valide");
		// verifie if null
		
		// verifiy if user existe by not active
		
		// verify password
		
		
		return user;
	}
	
	
}
