package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	public void saveEmployee(Employee e) {
		empRepo.save(e);
	}

	public List<Employee> getAllEmp() {
		List<Employee> e = empRepo.findAll();
		return e;
	}

	public void deleteByIdEmp(int id) {
		empRepo.deleteById(id);
	}

	public Employee getByIdEmp(int id) {
		 Employee emp = empRepo.findById(id).get();
		return emp;
		
	}
}
