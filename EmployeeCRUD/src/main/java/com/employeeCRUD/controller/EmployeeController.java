package com.employeeCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.employeeCRUD.model.Employee;
import com.employeeCRUD.service.EmployeeServiceImpl;



@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	/*
	 * @GetMapping("/") public String demo() { return "hello";
	 * 
	 * }
	 */
	
	  @GetMapping("/")
	  public String viewHomePage(Model model) {
	  model.addAttribute("allemplist",employeeServiceImpl.getAllEmployees());
	  
	  return "index"; }
	 
	
	@GetMapping("/addnew")
	public String addNewEmployee(Model model)
	{
		Employee employee=new Employee();
		
		model.addAttribute("employee",employee);
		return "newemployee";
		
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee )
	{
		employeeServiceImpl.save(employee);
		return "redirect:/";
		
	}

}
