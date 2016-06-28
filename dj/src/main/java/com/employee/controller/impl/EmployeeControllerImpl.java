package com.employee.controller.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.controller.EmployeeController;
import com.employee.dto.EmployeeDto;
import com.employee.populator.EmployeePopulator;
import com.employee.repository.EmployeeDao;
import com.employee.repository.impl.EmployeeDaoImpl;
import com.employee.service.EmployeeService;

@Path("/employeeController")
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired 
	EmployeeService employeeService;
	
	@Autowired
	EmployeePopulator employeePopulator;
	

	@POST
	@Path("/addEmployee")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public EmployeeDto addEmployee(EmployeeDto employee1) {
		System.out.println("asdasdasdasd"+employee1.getFirstName());
		EmployeeDto employee  = new  EmployeeDto();
		employee.setFirstName("xyz");
		employee.setLastName("PQR");
		employee.setEmailId("sdf@pqr");
		employee.setSalary(3000);
		employeeService.addEmployee(employee);
		System.out.println("Controller end...");
		System.out.println("Controller end...");
		return employee;
	}


	
	@GET
	@Path("/getEmployee")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public EmployeeDto getEmployee() {
		System.out.println("Inside getEmployee Controller");
		EmployeeDto employeeDto = employeeService.getEmployee();
		return employeeDto;
	}
	
	
	@PUT
	@Path("/updateEmployee")
	@Consumes(MediaType.APPLICATION_XML)
	@Override
	public void updateEmployee(EmployeeDto employee){
		employee  = new  EmployeeDto();
		employee.setEmpId(2);
		employee.setFirstName("xyz");
		employeeService.updateEmployee(employee);
	}



	@Override
	public void deleteEmployee(int id) {
		employeeService.deleteEmployee(id);
	}
	

}
