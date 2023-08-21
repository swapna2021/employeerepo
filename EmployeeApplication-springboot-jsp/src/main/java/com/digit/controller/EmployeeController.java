package com.digit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.digit.entity.Employee;
import com.digit.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

	@GetMapping("/")
	public ModelAndView getAllEmployees(){
		List<Employee>  empList=service.getAllEmployees();
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("employees",empList);
		return mv;
	}
	
	@GetMapping("/add-employee")
	public ModelAndView  addEmployeeForm() {
		ModelAndView mv=new ModelAndView("add-emp");
		mv.addObject("employee",new Employee());
		return mv;
	}
	
	@PostMapping("/save-emp")
	public String addEmployee(@ModelAttribute Employee employee) {
		service.addEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/update-employee/{id}" )
	public ModelAndView updateEmployee(@PathVariable("id")Integer id) {
		
		ModelAndView mv=new ModelAndView("update-emp");
		Employee emp=service.getById(id);
		mv.addObject("employee" ,emp);
		return mv;
		
	}
	
	@PostMapping("/emp-update/{id}")
	public String updateEmployee(@ModelAttribute Employee employee,@PathVariable("id")Integer id) {
		service.updateEmployee(employee,id);
		return "redirect:/";
	}
	
	@GetMapping("/delete-employee/{id}")
	public String deleteEmployee(@PathVariable("id")Integer id) {
		service.deleteEmployee(id);
		return "redirect:/";
	}
	
}
