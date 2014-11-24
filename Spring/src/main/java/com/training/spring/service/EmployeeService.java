package com.training.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.dao.EmployeeDao;
@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee findEmployee(Integer id)
	{
		return employeeDao.findEmployeeById(id);
	}
	
	public List<Employee> findAllEmployee()
	{
		return employeeDao.findAllEmployee();
	}
	
	public void save(Employee employee)
	{
		employeeDao.save(employee);
	}
	public void update(Employee employee)
	{
		employeeDao.update(employee);
	}
	public void delete(Employee employee)
	{
		employeeDao.delete(employee);
	}
}
