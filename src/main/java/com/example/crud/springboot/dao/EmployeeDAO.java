package com.example.crud.springboot.dao;

import java.util.List;

import com.example.crud.springboot.model.Employee;

public interface EmployeeDAO {
	List<Employee> get();

	Employee get(int id);

	void save(Employee employee);

	void delete(int id);
}
