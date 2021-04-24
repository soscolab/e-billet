package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import data.Admin;
import data.Evenement;

public class AdminDAO implements IAdminDAO {
	@PersistenceContext
	private EntityManager em; 
	

	@Override
	public Evenement save(Evenement c) {
		em.persist(c);
		return c;
		// TODO Auto-generated method stub
	}

	@Override
	public List<Evenement> findAll() {
		Query q= em.createQuery("Select c from Categorie c ");
		return q.getResultList();
	}

	@Override
	public Evenement update(Evenement c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		Admin todelete=em.find(Admin.class, id);
		em.remove(todelete);
		
	}

	
	
	
	
	
	
	
	
}
