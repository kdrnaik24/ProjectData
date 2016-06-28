package com.employee.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDto;
import com.employee.model.EmployeeModel;
import com.employee.populator.EmployeePopulator;
import com.employee.repository.EmployeeDao;
import com.employee.repository.impl.EmployeeDaoImpl;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	EmployeePopulator employeePopulator;
	
	@Override
	public EmployeeDto getEmployee() {
		EmployeeDto employeeDto = new EmployeeDto();
		employeePopulator.populate(employeeDao.getEmployee(),employeeDto);
		return employeeDto;
	}

	@Override
	public void addEmployee(EmployeeDto employeeDto) {
		EmployeeModel employeeModel = new EmployeeModel();
		employeePopulator.populate(employeeDto, employeeModel);
		employeeDao.addEmployee(employeeModel);
		
	}
	
	@Override
	public void updateEmployee(EmployeeDto employeeDto){
		EmployeeModel employeeModel = new EmployeeModel();
		employeePopulator.populate(employeeDto, employeeModel);
		employeeDao.updateEmployee(employeeModel);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}
	
	

}
