package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController 
{
	@Autowired
	private DepartmentService service;
	
	@PostMapping("/create")
	public ResponseEntity<?> createDepartment(@RequestBody Department department)
	{
		service.createDepartment(department);
		return new ResponseEntity<>("Department Created",HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{depId}")
	public ResponseEntity<?> updateDepartment(@RequestBody Department department, @PathVariable("depId") int depId )
	{
		Department updatedDepartment = service.updateDepartment(department, depId);
		return new ResponseEntity<>("Department Updated with depId =>"+updatedDepartment.getDepId(), HttpStatus.OK);
	}
	
	
	
	
	
	
}