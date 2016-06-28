package com.qm.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.Populator.ProjectPopulator;
import com.qm.Repository.impl.ProjectDaoImpl;
import com.qm.Service.ProjectService;
import com.qm.dto.ProjectDto;
import com.qm.model.ProjectModel;

@Service
public class ProjectServiceImpl implements ProjectService{

	
	@Autowired
	ProjectDaoImpl projectdao;
	
	@Autowired
	ProjectPopulator pops;
	
	@Override
	public void addProjects(ProjectModel project) {
	   ProjectDto proj=new ProjectDto();
	   pops.populate(proj, project);
	   projectdao.addProjects(project);
	}

	@Override
	public ProjectModel getProject(int projectId) {
	
		return projectdao.getProject(projectId);
	}

	@Override
	public List<ProjectModel> getAllProjects() {
	return projectdao.getAllProjects();
	}

	@Override
	public void deleteProject(ProjectModel project) {
	   
		projectdao.deleteProject(project);
		
	}

	@Override
	public void updateProject(ProjectModel project) {
		projectdao.updateProject(project);
		
	}
	
	
	

}
