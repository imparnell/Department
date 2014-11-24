
import java.applet.AppletContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.training.spring.bean.Hello;
import com.training.spring.bean.Humen;
import com.training.spring.bean.ExampleComponent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BeanTest 
{
	@Autowired
	private Hello hello;
	@Autowired
	private Humen humen;
	@Autowired
	private ExampleComponent exampleComponent;
	
	/*@Test
	public void testSimpleBean()
	{
		System.out.println("### This is test for Simple Bean ###");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) context.getBean("hello");
		System.out.println("########## Hello ##########");
	}
	
	@Test
	public void testAutowiredBean()
	{
		System.out.println("########## Autowired Hello ##########");
		System.out.println(hello);
	}
	
	@Test
	public void testAutowiredHumen()
	{
		System.out.println("########## Autowired Humen ##########");
		System.out.println(humen);
	}*/
	
	@Test
	public void ExampleComponent()
	{
//		System.out.println("Show exampleComponent: "+exampleComponent);
		System.out.println("Show hello: "+exampleComponent.getHello());
		System.out.println("Show hello: "+exampleComponent.getHumen());
		System.out.println("Show message: "+exampleComponent.getMessage());
		System.out.println("Show address: "+exampleComponent.getAddress());
		System.out.println("Show company: "+exampleComponent.getCompany());
	}
	
}

