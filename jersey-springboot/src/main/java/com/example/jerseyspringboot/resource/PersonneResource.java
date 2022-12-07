package com.example.jerseyspringboot.resource;


import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;

@Component
@Path("/api/v1")
public class PersonneResource {


    @GET
    @Produces("application/json")
    @Path("/personnes")
    public String getAll(){
        // TODO
        return "hello world";
    }
}
