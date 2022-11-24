package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartmentRepo;
import com.example.demo.model.Department;

@Service
public class DepartmentService
{
	
	@Autowired
	private DepartmentRepo repo;

	public void createDepartment(Department department) 
	{
		repo.save(department);
	}

	public Department updateDepartment(Department department, int depId)
	{
		Department expectedDepartment = repo.findById(depId).get();
		if(expectedDepartment != null)
		{
			expectedDepartment.setDepName(department.getDepName());
			repo.save(expectedDepartment);
			return expectedDepartment;
		}
		return null;
		
	}
	
}