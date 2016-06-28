package com.qm.dto;

public class TestScriptDto 
{
	private int testScriptId;
    private String scriptTitle ; 
	private String executionInstruction ; 
	private String dataset;
	public TestScriptDto(int testScriptId, String scriptTitle, String executionInstruction, String dataset) {
		super();
		this.testScriptId = testScriptId;
		this.scriptTitle = scriptTitle;
		this.executionInstruction = executionInstruction;
		this.dataset = dataset;
	}
	public TestScriptDto() {
		// TODO Auto-generated constructor stub
	}
	public int getTestScriptId() {
		return testScriptId;
	}
	public void setTestScriptId(int testScriptId) {
		this.testScriptId = testScriptId;
	}
	public String getScriptTitle() {
		return scriptTitle;
	}
	public void setScriptTitle(String scriptTitle) {
		this.scriptTitle = scriptTitle;
	}
	public String getExecutionInstruction() {
		return executionInstruction;
	}
	public void setExecutionInstruction(String executionInstruction) {
		this.executionInstruction = executionInstruction;
	}
	public String getDataset() {
		return dataset;
	}
	public void setDataset(String dataset) {
		this.dataset = dataset;
	}

	
	
	
}
