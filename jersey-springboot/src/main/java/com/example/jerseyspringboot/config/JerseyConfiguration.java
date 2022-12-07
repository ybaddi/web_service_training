package com.example.jerseyspringboot.config;

import com.example.jerseyspringboot.resource.PersonneResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration(){
        register(PersonneResource.class);
    }
}
