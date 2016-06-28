package com.qm.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.Populator.TestExecutionPopulator;
import com.qm.Repository.impl.TestExecutionDaoImpl;
import com.qm.Service.TestExecutionService;
import com.qm.dto.TestExecutionDto;
import com.qm.model.TestExecutionModel;

@Service
public class TestExecutionServiceImpl implements TestExecutionService{

	@Autowired
	TestExecutionDaoImpl testexecdao;
	@Autowired
	TestExecutionPopulator pops;
	
	
	@Override
	public void addTestExecution(TestExecutionModel testExecution) {
		TestExecutionDto testexec=new TestExecutionDto();
		pops.populate(testexec, testExecution);
		testexecdao.addTestExecution(testExecution);
		
	}
	@Override
	public TestExecutionModel getTestExecution(int testExecutionId) {
		return testexecdao.getTestExecution(testExecutionId);
	}
	@Override
	public List<TestExecutionModel> getAllTestExecutions() {
		return testexecdao.getAllTestExecutions();
	}
	@Override
	public void deleteTestExecution(TestExecutionModel testExecution) {
		testexecdao.deleteTestExecution(testExecution);
		
	}
	@Override
	public void updateTestExecution(TestExecutionModel testExecution) {
	testexecdao.updateTestExecution(testExecution);
		
	}
	
	
	
}
