package SpringIOC.com.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Sim sim =  context.getBean("sim",Sim.class);
        sim.calling();
        sim.data();
    }
}
