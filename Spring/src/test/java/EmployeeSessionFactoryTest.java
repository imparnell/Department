import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Employee;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:hibernate.xml"})
public class EmployeeSessionFactoryTest 
{
	@Autowired
	private SessionFactory sessionFactory;
//	@Test
//	public void testGetSessionFacotyFromFactory()
//	{
//		Session session = sessionFactory.openSession();
//		Employee employee =(Employee) session.get(Employee.class,3);
//		System.out.println(employee);
//	}
//	
//	@Test
//	public void testFindByFirstname()
//	{
//		Session session = sessionFactory.openSession();
//		List<Employee> emList = session.createQuery("FROM Employee e WHERE e.firstname ='John'").list();
//		System.out.println(emList);
//	}
	
//	@Test
//	public void testFindCriteriaByFirstnameAndLastname()
//	{
//		Session session = sessionFactory.openSession();
//		Criteria criterial = session.createCriteria(Employee.class);
//		criterial.add(Restrictions.eq("firstname", "Parn"));
//		criterial.add(Restrictions.eq("salary", 20000.00));
//		List<Employee> employeeList = criterial.list();
//		
//		System.out.println(employeeList);
//		session.close();
//	}
	@Test
	public void testFindNameQuery()
	{
		Session session = sessionFactory.openSession();
		Criteria criterial = session.createCriteria(Employee.class);
		List<Employee> allEm = session.getNamedQuery("findAllEmployee").list();
		System.out.println(allEm);
		System.out.println("total :"+allEm.size()+ " record");
		
		for (Employee employee : allEm)
		{
			System.out.println("Firstname :"+employee.getFirstname()+ ", "+employee.getDepartment());
		}
		session.close();
	}
}
