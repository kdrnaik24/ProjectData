package com.qm.Repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.qm.Repository.TestScriptDao;
import com.qm.model.TestScriptModel;

public class TestScriptDaoImpl implements TestScriptDao
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
	public void addTestScript(TestScriptModel testScript) {
		try{
            entityManager.persist(testScript);
            entityManager.flush();
      }catch(Exception ex){
            System.out.println("Exception occured while saving testScript"+ex.getMessage());
            ex.printStackTrace();
      }
	}

	@Override
	public TestScriptModel getTestScript(int testScriptId) {
		TestScriptModel testScript = entityManager.find(TestScriptModel.class, testScriptId);
		return testScript;
	}

	@Override
	public List<TestScriptModel> getAllTestScipts() {
		TypedQuery<TestScriptModel> qt = entityManager.createQuery("SELECT e FROM TestScriptModel e", TestScriptModel.class);
		List<TestScriptModel> testScriptlist = (List<TestScriptModel>)qt.getResultList();
		System.out.println("List:: "+testScriptlist);
		return testScriptlist;
	}

	@Override
	public void deleteTestScript(TestScriptModel testScript) {
		entityManager.remove(testScript);
		
	}

	@Override
	public void updateTestScript(TestScriptModel testScript) {
		entityManager.persist(testScript);
		
	}

	

	
	
}
