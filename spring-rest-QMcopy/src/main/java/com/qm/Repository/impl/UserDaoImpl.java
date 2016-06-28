package com.qm.Repository.impl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qm.Repository.UserDao;
import com.qm.model.UserModel;

public class UserDaoImpl implements UserDao
{
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public void addUser(UserModel User) {
		try{
            entityManager.persist(User);
            entityManager.flush();
      }catch(Exception ex){
            System.out.println("Exception occured while saving User"+ex.getMessage());
            ex.printStackTrace();
      }
	}

	@Override
	public UserModel getAuthenticatedUser(String Username, String password) {
		UserModel user=getUser(Username);
		if(user.getPassword().equals(Username))
			return user;
		else return null;
	}

	@Override
	public UserModel getUser(String Username) {
		UserModel user = entityManager.find(UserModel.class, Username);
		return user;
	}

	
}
