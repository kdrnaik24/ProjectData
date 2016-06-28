package com.employee.controller;

import javax.ws.rs.core.Response.ResponseBuilder;

import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;

public interface EmployeeController {

	public EmployeeDto addEmployee(EmployeeDto employee);
	
	public EmployeeDto getEmployee();
	
	public void updateEmployee(EmployeeDto employee);
	
	public void deleteEmployee(int id);
	
}
