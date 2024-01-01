package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empoServices;

	@RequestMapping("/viewPage")
	public String viewPageEmployee() {
		return "new_employee";
	}
//	@RequestMapping("/saveEmployee")
//	public String saveEmployee(Employee e) {
//		empoServices.saveEmployee(e);
//		return "new_employee";
//	}
//	@RequestMapping("/saveEmployee")
//	public String saveEmployee(
//			@RequestParam("name") String name,
//			@RequestParam("age") int age,
//			@RequestParam("email") String email,
//			@RequestParam("salary") int salary,
//			
//			Model model
//			) {
//		Employee emp = new Employee();
//		emp.setName(name);
//		emp.setAge(age);
//		emp.setEmail(email);
//		emp.setSalary(salary);
//		
//		empoServices.saveEmployee(emp);
//		model.addAttribute("msg", "Record is saved");
//		
//		return "new_employee";
//	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(
			EmployeeDto dto,
			Model model
			) {
		Employee emp = new Employee();
		emp.setName(dto.getName());
		emp.setAge(dto.getAge());
		emp.setEmail(dto.getEmail());
		emp.setSalary(dto.getSalary());
		empoServices.saveEmployee(emp);
		model.addAttribute("msg", "Record is saved");
		return "new_employee";
	}
	@RequestMapping("/getEmp")
	public String getAllEmp(Model model) {
		List<Employee> emp = empoServices.getAllEmp();
		model.addAttribute("emp", emp);
		return "list";
	}
	
	@RequestMapping("/delete")
	public String deleteByIdEmp(@RequestParam("id") int id,Model model) {
		empoServices.deleteByIdEmp(id);
		List<Employee> emp = empoServices.getAllEmp();
		model.addAttribute("emp", emp);
		return "list";
	}
	@RequestMapping("/getRegByid")
	public String getByIdEmp(@RequestParam("id") int id,Model model) {
		Employee emp = empoServices.getByIdEmp(id);
		model.addAttribute("emp", emp);
		return "update";
		
	}
}
