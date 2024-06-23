package DatabaseConnection.SpringORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DatabaseConnection.SpringORM.dao.StudentDao;
import DatabaseConnection.SpringORM.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao stuudentDao = context.getBean("StudentDao",StudentDao.class);
		/*
		 * Student student = new Student(1, "Hina", "hina@gmail.com");
		 * 
		 * stuudentDao.insert(student);
		 */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean go = true;
        while(go)
        {
        	System.out.println("Press 1 for add new Student");
        	System.out.println("Press 2 for get Student Details");
        	System.out.println("Press 3 for get all Student Details");
        	System.out.println("Press 4 for Delete Student ");
        	System.out.println("Press 5 for Update Student ");
        	System.out.println("Press 6 for Exits ");
        	
        	try{
        		
        		int input = Integer.parseInt(br.readLine());
        		
        		switch (input){
				case 1:
					// add 
					System.out.println("********************************");
					System.out.println("Enter Student Details !!! ");
					System.out.println("Enter Student ID : ");
					int id = Integer.parseInt(br.readLine());
					
					System.out.println("Enter Student City: ");
					String studentCity = (String)br.readLine();
					
					System.out.println("Enter Student Name : ");
					String studentName = (String)br.readLine();
					
					Student student = new Student(id, studentCity, studentName);
					stuudentDao.insert(student);
					
					
					System.out.println("***************************************************");
	
					break;
				
				case 2:
				    // get all student details	
		            
					System.out.println("Get all Student Details : ");
					List<Student> studentDetails = stuudentDao.getAllStudent();
					
					for(Student std : studentDetails)
						System.out.println(std);
					
					System.out.println("***************************************************");
					
					break;
				
				case 3:
					// get student details
					System.out.println("Enter Student ID : ");
					int userID = Integer.parseInt(br.readLine());
				    Student std = stuudentDao.getStudent(userID);
				    
				    System.out.println(std);
					
				    System.out.println("***************************************************");
					
					break;
				case 4:
					//Delete Student
					
					System.out.println("Enter Student ID : ");
					int userDeleteID = Integer.parseInt(br.readLine());
					stuudentDao.deleteStudent(userDeleteID);
					
					System.out.println("***************************************************");
					
					break;
			    
				case 5:	
					
					//Update Student : 
					System.out.println("Enter Student ID : ");
					int updateID = Integer.parseInt(br.readLine());
					Student std1 = stuudentDao.getStudent(updateID);
					
					System.out.println("Enter update Values : ");
					System.out.println("Enter Name : ");
					std1.setStudentName(br.readLine());
					
					System.out.println("Enter Student City ");
					std1.setStudentCity(br.readLine());
					
					
                   stuudentDao.updatrStudent(std1);				
                   System.out.println("***************************************************");
					
					break;
					
				case 6:
					go = false;
					break;
				default:
					break;
				}
        		
        		
        	}catch(Exception e)
        	{
        		System.out.println("Invalid Operation:"+e);
        	}
                   	
        }
        System.out.println("Thank you We Will meet soon...!!!!");
        
        
        
        
        
        
        
    }
}
