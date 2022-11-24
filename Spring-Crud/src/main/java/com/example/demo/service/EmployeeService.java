package com.example.demo.service;

import com.example.demo.model.Employee;

public class EmployeeService {
	
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmpid()) {
			employeeRepository.save(emp);
		}
	}

}
