package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;


public class EmployeeService {
	
	private EmployeeDao employeedao;
	
	public void addEmployee(Employee e) {
		employeedao.saveAll(e);
	}

}
