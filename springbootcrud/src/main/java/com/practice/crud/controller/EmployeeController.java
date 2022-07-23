package com.practice.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.crud.entity.Employee;
import com.practice.crud.entity.User;
import com.practice.crud.repositary.EmployeeRepo;
import com.practice.crud.repositary.UserRepo;
import com.practice.crud.service.EmploeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmploeService empService;
	@Autowired
	UserRepo userRepo;
	
	 @GetMapping("/findEmp")
	  public List<Employee> getEmployees(){
	  System.out.println("getting all employees");
	  System.out.println("--------------"+empService.getEmployees()); 
	  return  empService.getEmployees();
	  }
	 
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		System.out.println("Controller addEmployee");
		Employee emp = empService.addEmployee(employee);
		System.out.println("Let jump....");
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	
//	@PostMapping("/userSave")
//	public ResponseEntity<User> addUser(@RequestBody User user){
//		User u = userRepo.save(user);
//		System.out.println("jjjjjjjjjjj");
//		return new ResponseEntity<User>(u,HttpStatus.CREATED);
//			
//	}

}
