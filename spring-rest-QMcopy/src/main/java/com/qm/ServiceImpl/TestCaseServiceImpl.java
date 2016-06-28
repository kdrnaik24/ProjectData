package com.qm.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.Populator.TestCasePopulator;
import com.qm.Repository.impl.TestCaseDaoImpl;
import com.qm.Service.TestCaseService;
import com.qm.dto.TestCaseDto;
import com.qm.model.TestCaseModel;

@Service
public class TestCaseServiceImpl implements TestCaseService
{
   @Autowired
   TestCaseDaoImpl testcasedaoimpl;
   @Autowired
   TestCasePopulator testcasepopulator;
   

	@Override
	public void addTestCase(TestCaseModel testcasemodel) 
	{
		TestCaseDto testcasedto=new TestCaseDto();
		testcasepopulator.populate(testcasedto, testcasemodel);
		testcasedaoimpl.addTestCase(testcasemodel);
		
	}

	@Override
	public TestCaseModel getTestCase(int TestCaseId) {
		return testcasedaoimpl.getTestCase(TestCaseId);
	}

	@Override
	public List<TestCaseModel> getAllTestCases() {
		return testcasedaoimpl.getAllTestCases();
	}

	@Override
	public void deleteTestCase(TestCaseModel testCase) {
		testcasedaoimpl.deleteTestCase(testCase);
		
	}

	@Override
	public void updateTestCase(TestCaseModel testCase) {
		testcasedaoimpl.updateTestCase(testCase);
		
	}
	

}
