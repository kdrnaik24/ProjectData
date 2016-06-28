package com.qm.Repository;

import java.util.List;


import com.qm.model.TestScriptModel;

public interface TestScriptDao 
{
	public void addTestScript(TestScriptModel testScript);
	
	public TestScriptModel getTestScript(int testScriptId);
	
	public List<TestScriptModel> getAllTestScipts();
	
	public void deleteTestScript(TestScriptModel testScript);
	
	public void updateTestScript(TestScriptModel testScript);
}
