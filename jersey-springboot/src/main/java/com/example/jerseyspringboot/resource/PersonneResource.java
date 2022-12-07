package com.example.jerseyspringboot.resource;


import com.example.jerseyspringboot.dao.PersonneRepository;
import com.example.jerseyspringboot.exception.ResourceNotFoundException;
import com.example.jerseyspringboot.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
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
    public ResponseEntity<List<Personne>> getAll(){
        // TODO
        List<Personne> personnes = personneRepository.findAll();
//        if(personne == null){
////                .orElseThrow(()->    {//                    new ResourceNotFoundException("User not found with id "+ id)
//            return     ResponseEntity.notFound().build();
//
//        }
//                );
        return ResponseEntity.ok().body(personnes);
    }

//     TODO : find by id

    @GET
    @Produces("application/json")
    @Path("/personnes/{id}")
    public ResponseEntity<Personne> getById(
            @PathParam(value="id") Long id) throws ResourceNotFoundException{
        // TODO
        Personne personne = personneRepository.findById(id).orElse(null);
        if(personne == null){
//                .orElseThrow(()->    {//                    new ResourceNotFoundException("User not found with id "+ id)
            return     ResponseEntity.notFound().build();

        }
//                );
        return ResponseEntity.ok().body(personne);
    }
//    TODO find by nom

//     create personne
@POST
@Produces("application/json")
@Path("/personnes")
public ResponseEntity<Personne> addPersonne(Personne personne){
    // TODO
    Personne personne1 = personneRepository.save(personne);
//        if(personne == null){
////                .orElseThrow(()->    {//                    new ResourceNotFoundException("User not found with id "+ id)
//            return     ResponseEntity.notFound().build();
//
//        }
//                );
    return ResponseEntity.ok().body(personne1);
}
//    update personne

//    delete personne

    @DELETE
    @Produces("application/json")
    @Path("/personnes/delete/{id}")
    public ResponseEntity<Personne> delete(
            @PathParam(value="id") Long id) throws ResourceNotFoundException{
        // TODO
        Personne personne = personneRepository.findById(id).orElse(null);
//        if(personne != null)
            personneRepository.delete(personne);

//                );
        return ResponseEntity.ok().build();
    }
}
