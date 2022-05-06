package com.hms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hms.entities.Admin;

/*
 * Admins Data Access Object
 */
@Repository
public class RegistrationDAOImpl implements RegistrationDAO {

	@PersistenceContext
	private EntityManager em;

	/*
	 * Add admin User details to the database.
	 */
	@Override
	public void addAdmin(Admin admin) {
		em.persist(admin);
	}

	/*
	 * Get all the admin details from the database.
	 */
	@Override
	public List<Admin> findAllAdmin() {
		return em.createQuery("SELECT a FROM Admin a", Admin.class).getResultList();
	}

}