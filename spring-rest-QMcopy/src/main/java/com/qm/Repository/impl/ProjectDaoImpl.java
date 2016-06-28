package com.qm.Repository.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;
import com.qm.Repository.ProjectDao;
import com.qm.model.ProjectModel;

public class ProjectDaoImpl implements ProjectDao 
{
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void addProjects(ProjectModel project) {
		try{
            entityManager.persist(project);
            entityManager.flush();
      }catch(Exception ex){
            System.out.println("Exception occured while saving project"+ex.getMessage());
            ex.printStackTrace();
      }
	}

	@Override
	public ProjectModel getProject(int projectId) {
		ProjectModel project = entityManager.find(ProjectModel.class, projectId);
		return project;
	}
	
	@Transactional
	@Override
	public List<ProjectModel> getAllProjects() {
		TypedQuery<ProjectModel> qt = entityManager.createQuery("SELECT e FROM ProjectModel e", ProjectModel.class);
		List<ProjectModel> projectlist = (List<ProjectModel>)qt.getResultList();
		System.out.println("project "+projectlist);
		return projectlist;
	}

	@Override
	public void deleteProject(ProjectModel project) {
		entityManager.remove(project);
	}

	@Override
	public void updateProject(ProjectModel project) {
		entityManager.persist(project);
	}


}
