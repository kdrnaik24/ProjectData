package com.qm.Repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.qm.Repository.TestExecutionDao;
import com.qm.model.TestExecutionModel;


public class TestExecutionDaoImpl implements TestExecutionDao
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
	public void addTestExecution(TestExecutionModel testExecution) {
		try{
            entityManager.persist(testExecution);
            entityManager.flush();
      }catch(Exception ex){
            System.out.println("Exception occured while saving testExecution"+ex.getMessage());
            ex.printStackTrace();
      }
		
	}

	@Override
	public TestExecutionModel getTestExecution(int testExecutionId) {
		TestExecutionModel testExecution = entityManager.find(TestExecutionModel.class, testExecutionId);
		return testExecution;
	}

	@Override
	public List<TestExecutionModel> getAllTestExecutions() {
		TypedQuery<TestExecutionModel> qt = entityManager.createQuery("SELECT e FROM TestExecutionModel e", TestExecutionModel.class);
		List<TestExecutionModel> testExecutionlist = (List<TestExecutionModel>)qt.getResultList();
		System.out.println("testExecutionlist ::  "+testExecutionlist);
		return testExecutionlist;
	}



	@Override
	public void deleteTestExecution(TestExecutionModel testExecution) {
		entityManager.remove(testExecution);
		
	}

	@Override
	public void updateTestExecution(TestExecutionModel testExecution) {
		entityManager.persist(testExecution);
		
	}

	
	
}
