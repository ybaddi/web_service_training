package org.eclipse.dao;

import org.eclipse.model.Adresse;
import org.eclipse.model.Personne;
import org.hibernate.Session;

public class AdresseDao extends GenericDao<Adresse, Integer>{

	public AdresseDao(Session session) {
		super(session, Adresse.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
