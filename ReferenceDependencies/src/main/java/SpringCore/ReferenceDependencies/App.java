package SpringCore.ReferenceDependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Creation object.
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Student std = context.getBean("student",Student.class);
    	std.cheat();
    }
}
