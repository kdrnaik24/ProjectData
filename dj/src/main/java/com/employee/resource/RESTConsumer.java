package com.employee.resource;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.employee.model.EmployeeModel;



public class RESTConsumer {
	
	public static void main(String args[]){
		RESTConsumer restConsumer = new RESTConsumer();
		restConsumer.consumeRestService();
	}

	public void consumeRestService() {
		try {
			String uri = "http://localhost:8080/spring-rest-employee/rest/employeeServ/";
			URL url = new URL(uri);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/xml");

			JAXBContext jc = JAXBContext.newInstance(EmployeeModel.class);
			InputStream xml = connection.getInputStream();
			EmployeeModel employee = (EmployeeModel) jc.createUnmarshaller().unmarshal(xml);

			connection.disconnect();
			
			System.out.println("Employee Id:"+employee.getEmpId());
			System.out.println("Employee First Name:"+employee.getFirstName());
			System.out.println("Employee Last Name:"+employee.getLastName());
			System.out.println("Employee EmailId:"+employee.getEmailId());
			System.out.println("Employee Salary:"+employee.getSalary());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
