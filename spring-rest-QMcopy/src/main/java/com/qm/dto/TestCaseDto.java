package com.qm.dto;

public class TestCaseDto
{

	private int testCaseId;
	private String caseTitle; 
	private String description; 
	private String datasetexpected;
	
	public TestCaseDto(int testCaseId, String caseTitle, String description, String datasetexpected) {
		super();
		this.testCaseId = testCaseId;
		this.caseTitle = caseTitle;
		this.description = description;
		this.datasetexpected = datasetexpected;
	}

	public TestCaseDto() {
		// TODO Auto-generated constructor stub
	}

	public int getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(int testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getCaseTitle() {
		return caseTitle;
	}

	public void setCaseTitle(String caseTitle) {
		this.caseTitle = caseTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDatasetexpected() {
		return datasetexpected;
	}

	public void setDatasetexpected(String datasetexpected) {
		this.datasetexpected = datasetexpected;
	}

	
	
	
	
	
}
