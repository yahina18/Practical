package DatabaseConnection.com.database.practical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DBConnection implements InitializingBean, DisposableBean{
	
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection conn;
	
	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
    
	/*
	 * //Init method call at start of application //@PostConstruct public void
	 * init() throws Exception {
	 * System.out.println("Connection object initialize !!! "); conn = connection();
	 * }
	 * 
	 */	
	public Connection connection() throws Exception
	{
	   Class.forName(driver);
	   Connection conn = DriverManager.getConnection(url,user,password);
	   return conn;
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method");
		conn.close();
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Connection object create !! ");
		conn = connection();
		
	}
	
	
	
	/*
	 * //Destroy Method... //@PreDestroy public void destroy() throws SQLException {
	 * System.out.println("Connection object Destroy !!! "); conn.close(); }
	 */
	

}
