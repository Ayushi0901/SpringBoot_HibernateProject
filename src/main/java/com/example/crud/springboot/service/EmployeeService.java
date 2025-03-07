package com.example.crud.springboot.service;

import java.util.List;

import com.example.crud.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> get();

	Employee get(int id);

	void save(Employee employee);

	void delete(int id);
}
