package com.qm.Repository;

import java.util.List;

import com.qm.model.TestExecutionModel;



public interface TestExecutionDao 
{
	public void addTestExecution(TestExecutionModel testExecution);
	
	public TestExecutionModel getTestExecution(int testExecutionId);
	
	public List<TestExecutionModel> getAllTestExecutions();
	
	public void deleteTestExecution(TestExecutionModel testExecution);
	
	public void updateTestExecution(TestExecutionModel testExecution);
}
