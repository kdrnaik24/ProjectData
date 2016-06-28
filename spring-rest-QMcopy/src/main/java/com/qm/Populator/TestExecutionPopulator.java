package com.qm.Populator;

import org.springframework.stereotype.Component;

import com.qm.dto.TestExecutionDto;
import com.qm.model.TestExecutionModel;

@Component
public class TestExecutionPopulator {

	public void populate(TestExecutionDto testexecdto,TestExecutionModel testexecmodel)
	{
		testexecdto.setResult(testexecmodel.getResult());
		testexecdto.setRunsON(testexecmodel.getRunsON());
		testexecdto.setStatus(testexecmodel.getStatus());
		testexecdto.setTestCaseId(testexecmodel.getTestCaseId());
		testexecdto.setTestExecutionId(testexecmodel.getTestExecutionId());
		
		
	}
	
	public void populate(TestExecutionModel testexecmodel,TestExecutionDto testexecdto)
	{
		testexecmodel.setResult(testexecdto.getResult());
		testexecmodel.setRunsON(testexecdto.getRunsON());
		testexecmodel.setStatus(testexecdto.getStatus());
		testexecmodel.setTestCaseId(testexecdto.getTestCaseId());
		testexecmodel.setTestExecutionId(testexecdto.getTestExecutionId());
		
		
	}
	
	
}
