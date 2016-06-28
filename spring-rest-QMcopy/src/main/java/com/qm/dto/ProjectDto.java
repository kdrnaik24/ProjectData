package com.qm.dto;

public class ProjectDto 
{

	private int projectId;
	private String projectName ; 
	private String description ;
	
	public ProjectDto(int projectId, String projectName, String description) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.description = description;
	}
	public ProjectDto() {
		// TODO Auto-generated constructor stub
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
