import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})
public class EmployeeServiceTest 
{
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
//	@Test
//	public void testFindEmployeeByIdShouldFoundDate()
//	{
//		Employee employee = employeeService.findEmployee(3);
//		
//		System.out.println(employee);
//	}
	
//	@Test
//	public void testFindAllEmployee()
//	{
//		List<Employee> employee = (List<Employee>) employeeService.findAllEmployee();
//		System.out.println(employee);
//	}
	
//	@Test
//	public void testSave()
//	{
//		Employee employee = new Employee("Dear",300);
//		employeeService.save(employee);
//			
//	}
//	@Test
//	public void testUpdate()
//	{
//		
//		Employee employee = (Employee) hibernateTemplate.get(Employee.class, 8);
//		employee.setSalary(300000000);
//		employeeService.update(employee);
//			
//	}
	
	@Test
	public void testDelete()
	{
		Employee employee = (Employee) hibernateTemplate.get(Employee.class, 8);
		employeeService.delete(employee);
			
	}
}
