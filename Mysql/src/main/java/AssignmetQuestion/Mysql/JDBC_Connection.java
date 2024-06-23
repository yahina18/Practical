package AssignmetQuestion.Mysql;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBC_Connection {
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.user}")
	private String user;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;
	

	public void displayInfo()
	{
		System.out.println("User : " +user+ " Password : " +password+ " Url : " +url+ " Dirver : " +driver);		
		
	}
	
	public Connection getJDBCConnection() throws Exception
	{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,password);
		return con;
	}
	
	

}
