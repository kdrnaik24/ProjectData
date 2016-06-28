package com.qm.Populator;

import org.springframework.stereotype.Component;

import com.qm.dto.TestCaseDto;
import com.qm.model.TestCaseModel;

@Component
public class TestCasePopulator
{
	
	public void populate(TestCaseModel testcasemodel,TestCaseDto testcasedto)
	{
		testcasemodel.setTestCaseId(testcasedto.getTestCaseId());
		testcasemodel.setCaseTitle(testcasedto.getCaseTitle());
		testcasemodel.setDescription(testcasedto.getDescription());
		testcasemodel.setDatasetexpected(testcasedto.getDatasetexpected());
		
	}
	
	public void populate(TestCaseDto testcasedto,TestCaseModel testcasemodel)
	{
		testcasedto.setTestCaseId(testcasemodel.getTestCaseId());
		testcasedto.setCaseTitle(testcasemodel.getCaseTitle());
		testcasedto.setDatasetexpected(testcasemodel.getDatasetexpected());
		testcasedto.setDescription(testcasemodel.getDescription());
		
	}
	

}
