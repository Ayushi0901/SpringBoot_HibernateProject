package com.example.crud.springboot.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.crud.springboot.model.Employee;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee empObj = currentSession.get(Employee.class, id);
		return empObj;
	}

	@Override
	public void save(Employee employee) {
		Session curreSession = entityManager.unwrap(Session.class);
		curreSession.saveOrUpdate(employee);
	}

	@Override
	public void delete(int id) {
		Session curreSession = entityManager.unwrap(Session.class);
		Employee empObj = curreSession.get(Employee.class, id);
		curreSession.delete(empObj);
	}

}
