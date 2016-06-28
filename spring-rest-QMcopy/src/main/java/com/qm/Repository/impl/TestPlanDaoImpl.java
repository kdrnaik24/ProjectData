package com.qm.Repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import com.qm.Repository.TestPlanDao;
import com.qm.model.TestPlanModel;

public class TestPlanDaoImpl implements TestPlanDao
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
	public void addTestPlans(TestPlanModel testPlan) {
		try{
            entityManager.persist(testPlan);
            entityManager.flush();
      }catch(Exception ex){
            System.out.println("Exception occured while saving testPlan"+ex.getMessage());
            ex.printStackTrace();
      }
		
	}

	@Override
	public TestPlanModel getTestPlan(int testPlanId) {
		TestPlanModel testPlan = entityManager.find(TestPlanModel.class, testPlanId);
		return testPlan;
	}

	@Override
	public List<TestPlanModel> getAllTestPlans() {
		TypedQuery<TestPlanModel> qt = entityManager.createQuery("SELECT e FROM TestPlanModel e", TestPlanModel.class);
		List<TestPlanModel> testPlanlist = (List<TestPlanModel>)qt.getResultList();
		System.out.println("testPlanlist :: "+testPlanlist);
		return testPlanlist;
	}



	@Override
	public void deleteTestPlan(TestPlanModel testPlan) {
		
		entityManager.remove(testPlan);
	}

	@Override
	public void updateTestPlan(TestPlanModel testPlan) {
		entityManager.persist(testPlan);
		
	}

	
	
}
