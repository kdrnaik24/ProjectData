package com.qm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="TestCase")
public class TestCaseModel 
{
	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int testCaseId;
	
	private String caseTitle; 
	private String description; 
	private String datasetexpected;
	
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
	@Override
	public String toString() {
		return "TestCaseModel [testCaseId=" + testCaseId + ", caseTitle=" + caseTitle + ", description=" + description
				+ ", datasetexpected=" + datasetexpected + "]";
	} 
	
	
	
	
	
	
}
