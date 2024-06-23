package Spring.Value_Required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getInterestedCourse() {
		return interestedCourse;
	}
	
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	
	
	public String getHobby() {
		return hobby;
	}
	
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayInfo()
	{
		System.out.println("Name : "+name+"\n"+"InterestedCourse : "+interestedCourse+"\n"+"hobby :"+hobby);
	}

}
