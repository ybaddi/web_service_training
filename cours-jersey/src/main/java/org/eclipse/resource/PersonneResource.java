package org.eclipse.resource;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.config.HibernateUtil;
import org.eclipse.dao.PersonneDao;
import org.eclipse.model.Personne;
import org.hibernate.Session;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("personnes")
public class PersonneResource {

	Session session = HibernateUtil.getSessionFactory().openSession();
    PersonneDao pDao = new PersonneDao(session);
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Personne> getPersonnes() {
       
       return pDao.findAll();
       
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{id}")
    public Personne getPersonne(@PathParam(value="id") int id) {
       
       return pDao.findById(id);
       
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_XML) 
    @Produces(MediaType.APPLICATION_XML)
    public Personne addPersonne(Personne p) throws Exception {
       Integer id = pDao.save(p);
       p.setId(id);
       return p;
       
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML) 
    @Produces(MediaType.APPLICATION_XML)
    public Personne editPersonne(
    		Personne p) throws Exception {
       pDao.update(p);
       return p;
       
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_XML) 
    @Produces(MediaType.APPLICATION_XML)
    @Path(value = "/{id}")
    public Personne deletePersonne(
    		@PathParam(value="id") int id) throws Exception {
       Personne p = pDao.delete(id);
       return p;       
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path(value = "/findBy")
    public List<Personne> getPersonneWhere(
    		@DefaultValue("0")
    		@QueryParam(value="min") 
    		int minAge,
    		@DefaultValue("90")
    		@QueryParam(value="max") 
    		int maxAge
    		) throws Exception {
       
       return pDao.findAll().stream()
    		   .filter(p -> p.getAge() >= minAge &&
    		   p.getAge() <= maxAge)
    		   .collect(Collectors.toList());
    }
}
