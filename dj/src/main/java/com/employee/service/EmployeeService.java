package com.employee.service;

import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;

public interface EmployeeService {

	public void addEmployee(EmployeeDto employee);
	public void updateEmployee(EmployeeDto employee);
	public EmployeeDto getEmployee();
	public void deleteEmployee(int id);
	
}
