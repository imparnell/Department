import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Department;
import com.hibernate.annotation.entity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})

public class EmployeeHibernateTemplateTest 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	private static SessionFactory sessionFactory;
	private static Session session;
	private Department department;
//	
//	@Test
//	public void testGetEmployeeByPk()
//	{
//		System.out.println(hibernateTemplate);
//		Employee employee = hibernateTemplate.get(Employee.class, 2);
//		System.out.println("firstname: "+employee.getFirstname());
//		System.out.println("lastname: "+employee.getLastname());
//	}
	
//	@Test
//	public void testFindEmployeeWithHQL()
//	{
//		List<Employee> employeeList = hibernateTemplate.find("from Employee");
//		
//		for(Employee employee: employeeList)
//		{
//			System.out.println("Fisrtname: "+employee.getFirstname()
//					+", Lastname: "+employee.getLastname()
//					+", Salary: "+employee.getSalary());
//		}
//	}
	
//	@Test
//	public void testFindDepartmentWithHQL()
//	{
//		List<Department> departmentList = hibernateTemplate.find("from Department");
//		
//		for(Department department: departmentList)
//		{
//			System.out.println("ID: "+department.getId()+", Name: "+department.getName());
//		}
//	}
	
//	@Test
//	public void testFindEmplyeeWithHQLbyParameter()
//	{
//		List<Employee> employeeList = hibernateTemplate.find("from Employee where id=?", new Integer[]{2});
//		displayEmployee(employeeList);
//	}
	
//	@Test
//	public void testFindEmployeeWithNameQury()
//	{
//		List<Employee> employeeList = hibernateTemplate.findByNamedQuery("findAllEmployee");
//		displayEmployee(employeeList);
//	}
	
//	@Test
//	public void testFindEmployeeCritetaria()
//	{
//		DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
//		criteria.add(Restrictions.eq("firstname", "David"));
//		
//		List<Employee> employeeList = hibernateTemplate.findByCriteria(criteria);
//		displayEmployee(employeeList);
//	}
	
//	@Test
//	public void saveEmployee()
//	{
//		Department department1 = new Department();
//		department1.setName("IT");
//		Department department2 = new Department();
//		department2.setName("HR");
//		hibernateTemplate.save(department1);
//		hibernateTemplate.save(department2);
//		
//		Employee employee1 = new Employee("John",department1);
//		Employee employee2 = new Employee("David",department1);
//		Employee employee3 = new Employee("Bill",department2);
//		Employee employee = new Employee("Parn",department1);
//		hibernateTemplate.save(employee);
//		hibernateTemplate.save(employee1);
//		hibernateTemplate.save(employee2);
//		hibernateTemplate.save(employee3);
//	}
	
	@Test
	public void updateEmployee()
	{

		Employee employee = hibernateTemplate.get(Employee.class,3);
		employee.setSalary(20000);
		hibernateTemplate.update(employee);
	}
	
//	@Test
//	public void deleteEmployee()
//	{
//
//		Employee employee = hibernateTemplate.get(Employee.class,1);
//		hibernateTemplate.delete(employee);
//	}
	
	private void displayEmployee(List<Employee> employeeList)
	{
		for(Employee employee: employeeList)
		{
			System.out.println("Fisrtname: "+employee.getFirstname()
					+", Lastname: "+employee.getLastname()
					+", Salary: "+employee.getSalary());
		}
	}
	
	private void displayDepartment(List<Department> departmentList)
	{
		for(Department department: departmentList)
		{
			System.out.println("ID: "+department.getId()+", Name: "+department.getName());
		}
	}
}
