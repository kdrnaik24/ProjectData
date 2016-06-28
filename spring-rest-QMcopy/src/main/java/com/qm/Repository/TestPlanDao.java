package com.qm.Repository;

import java.util.List;

import com.qm.model.TestPlanModel;



public interface TestPlanDao 
{
	public void addTestPlans(TestPlanModel testPlan);
	
	public TestPlanModel getTestPlan(int testPlanId);
	
	public List<TestPlanModel> getAllTestPlans();
	
	public void deleteTestPlan(TestPlanModel testPlan);
	
	public void updateTestPlan(TestPlanModel testPlan);
}
