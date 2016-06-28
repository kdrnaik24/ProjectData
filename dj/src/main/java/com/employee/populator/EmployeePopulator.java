package com.employee.populator;

import org.springframework.stereotype.Component;

import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;

@Component
public class EmployeePopulator {

	public void populate(EmployeeModel employeeModel,EmployeeDto employeeDto){
		employeeDto.setEmailId(employeeModel.getEmailId());
		employeeDto.setEmpId(employeeModel.getEmpId());
		employeeDto.setFirstName(employeeModel.getFirstName());
		employeeDto.setLastName(employeeModel.getLastName());
		employeeDto.setSalary(employeeModel.getSalary());
	}
	
	public void populate(EmployeeDto employeeDto,EmployeeModel employeeModel){
		
		employeeModel.setFirstName(employeeDto.getFirstName());
		employeeModel.setLastName(employeeDto.getLastName());
		employeeModel.setEmailId(employeeDto.getEmailId());
		employeeModel.setSalary(employeeDto.getSalary());
	}
}
