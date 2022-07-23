package com.practice.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.crud.entity.Employee;
@Service
public interface EmploeService {
	
	public Employee addEmployee(Employee emp);
	
	public List<Employee> getEmployees();

}
