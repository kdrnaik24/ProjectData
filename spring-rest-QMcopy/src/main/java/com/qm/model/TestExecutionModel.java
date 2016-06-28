package com.qm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="TestExecution")
public class TestExecutionModel 
{
	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int testExecutionId;
	
	private String runsON ; 
	private String result ; 
	private String status;
	private String testCaseId;
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
	@Override
	public String toString() {
		return "TestExecutionModel [testExecutionId=" + testExecutionId + ", runsON=" + runsON + ", result=" + result
				+ ", status=" + status + ", testCaseId=" + testCaseId + "]";
	}
	
	
	
}
