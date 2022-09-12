package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entity.College;

public class ICollegeRepositoryImpl implements ICollegeRepository {
	private EntityManager em;
	//constructor
	public ICollegeRepositoryImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}
	//implementing method
	@Override
	public College addCollege(College college) {
		em.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		em.merge(college);
		return college;
	}

	@Override
	public College searchCollege(long id) {
		College college=em.find(College.class, id);
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		em.remove(id);
		return true;
	}
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
		
	}
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}
		
}
	
	


