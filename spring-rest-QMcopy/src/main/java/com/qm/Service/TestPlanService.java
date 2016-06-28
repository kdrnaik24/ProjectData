package com.qm.Service;

import java.util.List;

import com.qm.dto.TestPlanDto;
import com.qm.model.TestPlanModel;

public interface TestPlanService {
public void addTestPlans(TestPlanDto testPlandto);
	
	public TestPlanModel getTestPlan(int testPlanId);
	
	public List<TestPlanModel> getAllTestPlans();
	
	public void deleteTestPlan(TestPlanModel testPlan);
	
	public void updateTestPlan(TestPlanModel testPlandto);
}
