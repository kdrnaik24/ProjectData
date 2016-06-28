package com.qm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="TestPlan")
public class TestPlanModel 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int testPlanId;
	
	private int projectId;
	private String planTitle; 
	private String description; 
	private String status; 
	private String type;
	
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getTestPlanId() {
		return testPlanId;
	}
	public void setTestPlanId(int testPlanId) {
		this.testPlanId = testPlanId;
	}
	public String getPlanTitle() {
		return planTitle;
	}
	public void setPlanTitle(String planTitle) {
		this.planTitle = planTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "TestPlanModel [testPlanId=" + testPlanId + ", projectId=" + projectId + ", planTitle=" + planTitle
				+ ", description=" + description + ", status=" + status + ", type=" + type + "]";
	}
	
	
	
	
	
}
