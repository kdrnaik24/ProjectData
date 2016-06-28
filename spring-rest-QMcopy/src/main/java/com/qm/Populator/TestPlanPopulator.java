package com.qm.Populator;

import org.springframework.stereotype.Component;

import com.qm.dto.TestPlanDto;
import com.qm.model.TestPlanModel;

@Component
public class TestPlanPopulator
{
	public void populate(TestPlanDto testplandto,TestPlanModel testplanmodel){
		
		testplandto.setProjectId(testplanmodel.getProjectId());
		testplandto.setTestPlanId(testplanmodel.getTestPlanId());
		testplandto.setDescription(testplanmodel.getDescription());
		testplandto.setPlanTitle(testplanmodel.getPlanTitle());
		testplandto.setType(testplanmodel.getType());
		testplandto.setStatus(testplanmodel.getStatus());
		
	}
	
	
public void populate(TestPlanModel testplanmodel,TestPlanDto testplandto){
		testplanmodel.setProjectId(testplandto.getProjectId());
		testplanmodel.setDescription(testplandto.getDescription());
		testplanmodel.setStatus(testplandto.getStatus());
		testplanmodel.setPlanTitle(testplandto.getPlanTitle());
		testplanmodel.setType(testplandto.getType());
		testplanmodel.setTestPlanId(testplandto.getTestPlanId());
	}
	

}
