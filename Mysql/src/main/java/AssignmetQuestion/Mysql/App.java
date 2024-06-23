package AssignmetQuestion.Mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
		/* System.out.println( "Hello World!" ); */
    	ApplicationContext context = new ClassPathXmlApplicationContext("benas.xml");
    	JDBC_Connection connection = context.getBean("mysqlConnection",JDBC_Connection.class);
    	connection.displayInfo();
    	System.out.println("Connection class object : "+connection.getJDBCConnection());
    }
}
