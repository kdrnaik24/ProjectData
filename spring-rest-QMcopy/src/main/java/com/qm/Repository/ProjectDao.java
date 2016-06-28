package com.qm.Repository;

import java.util.List;

import com.qm.model.ProjectModel;

public interface ProjectDao 
{
	public void addProjects(ProjectModel project);
	
	public ProjectModel getProject(int projectId);
	
	public List<ProjectModel> getAllProjects();

	public void deleteProject(ProjectModel project);

	public void updateProject(ProjectModel project);
}
