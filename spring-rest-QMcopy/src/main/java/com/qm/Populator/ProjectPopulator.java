package com.qm.Populator;

import org.springframework.stereotype.Component;

import com.qm.dto.ProjectDto;
import com.qm.model.ProjectModel;

@Component
public class ProjectPopulator {

	public void populate(ProjectModel projectmodel,ProjectDto projectdto)
	{
		projectmodel.setProjectId(projectdto.getProjectId());
		projectmodel.setProjectName(projectdto.getProjectName());
		projectmodel.setDescription(projectdto.getDescription());
	}
	

	public void populate(ProjectDto projectdto,ProjectModel projectmodel)
	{
		projectdto.setProjectId(projectmodel.getProjectId());
		projectdto.setProjectName(projectmodel.getProjectName());
		projectdto.setDescription(projectmodel.getDescription());
	}
	
}
