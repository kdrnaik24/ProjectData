package com.employee.dto;


import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;


public class EmployeeDto {

	private int empId;
	private String firstName;
	private String lastName;
	private String emailId;
	private double salary;
	
	
	public EmployeeDto() {
	
	}
	
	public EmployeeDto(int empId, String firstName, String lastName, String emailId, double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
