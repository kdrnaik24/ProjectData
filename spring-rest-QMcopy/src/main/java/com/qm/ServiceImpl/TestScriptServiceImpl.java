package com.qm.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.Populator.TestScriptPopulator;
import com.qm.Repository.impl.TestScriptDaoImpl;
import com.qm.Service.TestScriptService;
import com.qm.dto.TestScriptDto;
import com.qm.model.TestScriptModel;

@Service
public class TestScriptServiceImpl implements TestScriptService{

	
	@Autowired
	TestScriptPopulator testscriptpopulator;
	@Autowired
	TestScriptDaoImpl testscriptdaoimpl;
	@Override
	public void addTestScript(TestScriptModel testScript) {
		TestScriptDto testscriptdto=new TestScriptDto();
		testscriptpopulator.populator(testScript, testscriptdto);
		testscriptdaoimpl.addTestScript(testScript);
		
	}
	@Override
	public TestScriptModel getTestScript(int testScriptId) {
		return testscriptdaoimpl.getTestScript(testScriptId);
	}
	@Override
	public List<TestScriptModel> getAllTestScipts() {
	return testscriptdaoimpl.getAllTestScipts();
	}
	@Override
	public void deleteTestScript(TestScriptModel testScript) {
		testscriptdaoimpl.deleteTestScript(testScript);
		
	}
	@Override
	public void updateTestScript(TestScriptModel testScript) {
		testscriptdaoimpl.updateTestScript(testScript);
		
	}
}
