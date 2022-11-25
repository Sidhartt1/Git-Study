package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/employees")
	public void addEmployees(@RequestBody Employee employee){
		System.out.println("sidhartt changes");
		employeeService.addEmployee(employee);
	
	}
	
	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee e, @PathVariable int id){
		employeeService.updateEmployee(e, id);
	}
	
	@DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
            employeeService.deletemployee(id);
    }
	@GetMapping("/employees")
	public List<Employee> getEmployess() {
		return employeeService.getEmployes();
	}
}