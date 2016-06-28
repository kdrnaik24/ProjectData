package com.employee.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;
import com.employee.repository.EmployeeDao;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public EmployeeModel getEmployee() {
		TypedQuery<EmployeeModel> qt = entityManager.createQuery("SELECT e FROM EmployeeModel e", EmployeeModel.class);
		List<EmployeeModel> employeeList = (List<EmployeeModel>)qt.getResultList();
		System.out.println("employeeList"+employeeList);
		return employeeList.get(0);
	}
	
	@Override
	@Transactional
	public void addEmployee(EmployeeModel employee) {
		System.out.println("addEmployee"+employee);
		try{
			entityManager.persist(employee);
			entityManager.flush();
		}catch(Exception ex){
			System.out.println("Exception occured while saving employee"+ex.getMessage());
			ex.printStackTrace();
		}

	}
	
	@Override
	public void updateEmployee(EmployeeModel employee) {
		entityManager.persist(employee);
	}
	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		entityManager.remove(EmployeeModel.class);
		
	}
	

}
