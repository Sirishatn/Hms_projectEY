package com.hms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hms.entities.Admin;

/*
 * 
 */
@Repository
public class AdminDAOImpl implements AdminDAO {

	@PersistenceContext
	private EntityManager em;

	/*
	 * 
	 */
	@Override
	public Admin getAdminById(int id) {
		Admin admin = em.find(Admin.class, id);
		return admin;
	}
	
	/*
	 * 
	 */
	@Override
	public List<Admin> getAllAdmins() {
		  return em.createQuery("SELECT a FROM Admin a", Admin.class).getResultList();   
	}

}
