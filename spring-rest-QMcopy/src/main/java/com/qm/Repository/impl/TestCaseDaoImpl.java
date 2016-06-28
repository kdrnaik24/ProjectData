package com.qm.Repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import com.qm.Repository.TestCaseDao;
import com.qm.model.TestCaseModel;

public class TestCaseDaoImpl implements TestCaseDao
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
	public void addTestCase(TestCaseModel testcase) {
		try{
            entityManager.persist(testcase);
            entityManager.flush();
      }catch(Exception ex){
            System.out.println("Exception occured while saving testcase"+ex.getMessage());
            ex.printStackTrace();
      }
		
	}

	@Override
	public TestCaseModel getTestCase(int TestCaseId) {
		TestCaseModel testCase = entityManager.find(TestCaseModel.class, TestCaseId);
		return testCase;
	}

	@Override
	public List<TestCaseModel> getAllTestCases() {
		TypedQuery<TestCaseModel> qt = entityManager.createQuery("SELECT e FROM TestCaseModel e", TestCaseModel.class);
		List<TestCaseModel> testCaselist = (List<TestCaseModel>)qt.getResultList();
		System.out.println("project "+testCaselist);
		return testCaselist;
	}

	@Override
	public void deleteTestCase(TestCaseModel testCase) {
		entityManager.remove(testCase);
		
	}

	@Override
	public void updateTestCase(TestCaseModel testCase) {
		
		entityManager.persist(testCase);
	}


	
}
