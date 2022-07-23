package com.practice.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.crud.entity.Employee;
import com.practice.crud.repositary.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmploeService{
	@Autowired
	EmployeeRepo empRepo;

	@Override
	public Employee addEmployee(Employee emp) {
		System.out.println("I am in addEmployee");
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getEmployees() {
		System.out.println("I am in getEmployees");
		return empRepo.findAll();
	}

	
}
