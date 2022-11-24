package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeedao;
	
	public void addEmployee(Employee e) {
		employeedao.save(e);

	}
	
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmpid()) {
			employeedao.save(emp);
		}
	}
	
	public void deletemployee(int id ) {
        employeedao.deleteById(id);

}

	public List<Employee> getEmployes() {
		return employeedao.findAll();
		
	}


}
