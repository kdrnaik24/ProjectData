package com.qm.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.Populator.TestPlanPopulator;
import com.qm.Repository.impl.TestPlanDaoImpl;
import com.qm.Service.TestPlanService;
import com.qm.dto.TestPlanDto;
import com.qm.model.TestPlanModel;

@Service
public class TestPlanServiceImpl implements TestPlanService {

	@Autowired
	TestPlanDaoImpl testplandao;
	@Autowired
	TestPlanPopulator testPlanPopulator;
	
	
	@Override
	public void addTestPlans(TestPlanDto testPlandto) 
	{
		TestPlanModel testplanmodel=new TestPlanModel();
		testPlanPopulator.populate(testPlandto,testplanmodel);
		testplandao.addTestPlans(testplanmodel);
		
	}
	@Override
	public TestPlanModel getTestPlan(int testPlanId) {
		return testplandao.getTestPlan(testPlanId);
		
	}
	@Override
	public List<TestPlanModel> getAllTestPlans() {
		return testplandao.getAllTestPlans();
	}
	@Override
	public void deleteTestPlan(TestPlanModel testPlan) {
		testplandao.deleteTestPlan(testPlan);
		
	}
	
	@Override
	public void updateTestPlan(TestPlanModel testPlanmodel) {
		
		testplandao.updateTestPlan(testPlanmodel);
	}
	
	
}
