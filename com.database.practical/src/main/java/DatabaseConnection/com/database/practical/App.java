package DatabaseConnection.com.database.practical;

import java.sql.Connection;

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
		/*
		 * DBConnection dbConnection = new DBConnection(); Connection conn =
		 * dbConnection.connection();
		 * System.out.println("Connection Created !!! "+conn);
		 */ 
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    DBConnection conn = context.getBean("dbConnection",DBConnection.class);
    System.out.println("Connection create !! "+conn);
    
    ((ClassPathXmlApplicationContext)context).close();
    
   }
}
