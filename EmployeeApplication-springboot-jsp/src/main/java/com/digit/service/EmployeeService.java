package com.digit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Employee;
import com.digit.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}

	public Employee updateEmployee(Employee employee,int id) {	
		Employee emp=repository.findById(id).get();
		emp.setEmployeeName(employee.getEmployeeName());
		emp.setEmployeeSalary(employee.getEmployeeSalary());
		return repository.save(emp);
	}

	public void deleteEmployee(int id) {
	
		Employee employee = repository.findById(id).get();
		repository.delete(employee);
	}
	
	
	public Employee getById(int id) {
		return repository.findById(id).get();
	}

}
