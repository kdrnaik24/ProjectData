package com.qm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="TestScript")
public class TestScriptModel 
{
	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int testScriptId;
	
	private String scriptTitle ; 
	private String executionInstruction ; 
	private String dataset;
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
	@Override
	public String toString() {
		return "TestScriptModel [testScriptId=" + testScriptId + ", scriptTitle=" + scriptTitle
				+ ", executionInstruction=" + executionInstruction + ", dataset=" + dataset + "]";
	}
	
	
	
	
	
	
	
}
