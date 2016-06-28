package com.qm.dto;

public class TestExecutionDto 
{
	private int testExecutionId;
	private String runsON ; 
	private String result ; 
	private String status;
	private String testCaseId;
	
	public TestExecutionDto(int testExecutionId, String runsON, String result, String status, String testCaseId) {
		super();
		this.testExecutionId = testExecutionId;
		this.runsON = runsON;
		this.result = result;
		this.status = status;
		this.testCaseId = testCaseId;
	}

	public TestExecutionDto() {
		// TODO Auto-generated constructor stub
	}

	public int getTestExecutionId() {
		return testExecutionId;
	}

	public void setTestExecutionId(int testExecutionId) {
		this.testExecutionId = testExecutionId;
	}

	public String getRunsON() {
		return runsON;
	}

	public void setRunsON(String runsON) {
		this.runsON = runsON;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}
	
	
	
	

}
