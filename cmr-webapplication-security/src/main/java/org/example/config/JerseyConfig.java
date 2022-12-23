package org.example.config;

import javax.ws.rs.ApplicationPath;

import org.example.resources.AuthenticationResource;
import org.example.resources.MainResource;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(MainResource.class);
		register(AuthenticationResource.class);
	}
}
