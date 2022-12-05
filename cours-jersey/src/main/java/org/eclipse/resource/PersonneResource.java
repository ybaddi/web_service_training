package org.eclipse.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Personne> getPersonnes() {
       Session session = HibernateUtil.getSessionFactory().openSession();
       PersonneDao pDao = new PersonneDao(session);
       return pDao.findAll();
       
    }
}
