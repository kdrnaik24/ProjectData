package com.qm.Repository;

import java.util.List;

import com.qm.model.TestCaseModel;


public interface TestCaseDao 
{
	public void addTestCase(TestCaseModel testcase);
	
	public TestCaseModel getTestCase(int TestCaseId);
	
	public List<TestCaseModel> getAllTestCases();
	
	public void deleteTestCase(TestCaseModel testCase);
	
	public void updateTestCase(TestCaseModel testCase);
}
