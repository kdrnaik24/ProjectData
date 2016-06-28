package com.qm.Service;

import java.util.List;

import com.qm.model.TestScriptModel;

public interface TestScriptService
{
   public void addTestScript(TestScriptModel testScript);
	
	public TestScriptModel getTestScript(int testScriptId);
	
	public List<TestScriptModel> getAllTestScipts();
	
	public void deleteTestScript(TestScriptModel testScript);
	
	public void updateTestScript(TestScriptModel testScript);

}
