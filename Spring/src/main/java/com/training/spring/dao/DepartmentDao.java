package com.training.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hibernate.annotation.entity.Department;
import com.training.spring.service.EmployeeService;

@Repository
public class DepartmentDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public Department findDepartmentById(Integer id)
	{
		return hibernateTemplate.get(Department.class, id);
	}
	
	public List<Department> findAllDepartment()
	{
		return hibernateTemplate.find("from Department");
	}
	
	public void save(Department department)
	{
		hibernateTemplate.save(department);
	}
	
	public void update(Department department)
	{
		hibernateTemplate.update(department);

	}
	public void delete(Department department)
	{
		
		hibernateTemplate.delete(department);

	}
}

