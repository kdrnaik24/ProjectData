package com.qm.dto;

public class TestPlanDto 
{

	private int testPlanId;
	private int projectId;
	private String planTitle; 
	private String description; 
	private String status; 
	private String type;
	
	public TestPlanDto(int testPlanId, int projectId, String planTitle, String description, String status,
			String type) {
		super();
		this.testPlanId = testPlanId;
		this.projectId = projectId;
		this.planTitle = planTitle;
		this.description = description;
		this.status = status;
		this.type = type;
	}

	public TestPlanDto() {
		// TODO Auto-generated constructor stub
	}

	public int getTestPlanId() {
		return testPlanId;
	}

	public void setTestPlanId(int testPlanId) {
		this.testPlanId = testPlanId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
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
	
	
	
	

}
