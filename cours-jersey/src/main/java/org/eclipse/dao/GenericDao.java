package org.eclipse.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenericDao<T,P> {

	protected Session session;
	private Class<T> entity;
	public GenericDao(Session session, Class<T> entity) {
		super();
		this.session = session;
		this.entity = entity;
	}
	public Session getSession() {
		return session;
	}
	
	
	public P save(T obj) throws Exception{
		Transaction tx = null;
		P result;
		try {
		tx =session.beginTransaction();
		result = (P) session.save(obj);
		tx.commit();
		}catch(Exception e) {
			if(tx != null) tx.rollback();
			throw e;
		}
		return result;
		
	}
	
	public void update(T obj){
		
		Transaction tx = null;
		try {
		tx =session.beginTransaction();
		session.saveOrUpdate(obj);
		tx.commit();
		}catch(Exception e) {
			if(tx != null) tx.rollback();
			throw e;
		}
	}
	
	
	public T delete(int id){
		Transaction tx = null;
		T obj = null;
		try {
		tx =session.beginTransaction();
		obj = findById(id);
		if(obj!=null)session.delete(obj);
		tx.commit();
		}catch(Exception e) {
			if(tx != null) tx.rollback();
			throw e;
		}
		
		
		return obj;
	}
	
	public T  findById(int id){
		return session.get(entity, id);
	}
	
	public List<T> findAll(){

		List<T> list = (List<T>)session.createQuery("from " + entity.getName()).list();
		return list;
	}
	
	
	
}
