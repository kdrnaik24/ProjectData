package com.employee.repository;

import com.employee.model.EmployeeModel;

public interface EmployeeDao {

	public EmployeeModel getEmployee();
	public void addEmployee(EmployeeModel employee);
	public void updateEmployee(EmployeeModel employee);
	public void deleteEmployee(int id);
}
