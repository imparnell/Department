import java.util.List;

import javax.crypto.spec.DESedeKeySpec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Department;
import com.training.spring.service.DepartmentService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})
public class DepartmentServiceTest 
{
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Test
	public void testFindDepartmentByIdShouldFoundDate()
	{
		Department department = departmentService.findDepartment(3);
		
		System.out.println(department);
	}
	
//	@Test
//	public void testFindAllDepartment()
//	{
//		List<Department> department = (List<Department>) departmentService.findAllDepartment();
//		System.out.println(department);
//	}
	
//	@Test
//	public void testSave()
//	{
//		Department department = new Department();
//		department.setName("IC");
//		departmentService.save(department);
//			
//	}
//	@Test
//	public void testUpdate()
//	{
//		
//		Department department = (Department) hibernateTemplate.get(Department.class, 2);
//		department.setName("EG");
//		departmentService.update(department);
//			
//	}
	
	@Test
	public void testDelete()
	{
		Department department = (Department) hibernateTemplate.get(Department.class, 4);
		departmentService.delete(department);
			
	}
}

