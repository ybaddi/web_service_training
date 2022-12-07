package com.example.jerseyspringboot.resource;


import com.example.jerseyspringboot.dao.PersonneRepository;
import com.example.jerseyspringboot.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("/api/v1")
public class PersonneResource {


    @Autowired
    private PersonneRepository personneRepository;
    @GET
    @Produces("application/json")
    @Path("/personnes")
    public List<Personne> getAll(){
        // TODO
        return personneRepository.findAll();
    }

//     TODO : find by id

    @GET
    @Produces("application/json")
    @Path("/personnes/{id}")
    public ResponseEntity<Personne> getById(
            @PathParam(value="id") Long id) throws Exception{
        // TODO
        Personne personne = personneRepository.findById(id)
                .orElseThrow(()-> new Exception("User not found"));
        return ResponseEntity.ok().body(personne);
    }
//    TODO find by nom

//     create personne

//    update personne

//    delete personne
}
