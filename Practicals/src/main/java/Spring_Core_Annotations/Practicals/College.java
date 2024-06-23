package Spring_Core_Annotations.Practicals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("college")
public class College {

	@Value("${College.Name}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	//@Qualifier("mathTeacher")
	private Teacher teacher;
	
	
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void displayInfo()
	{
		System.out.println("College Name : "+collegeName);
		principal.principalInfo();
		teacher.teach();
	}
	
	/*
	 * public College(Principal principal) { this.principal = principal; }
	 * 
	 * public void test() { System.out.println("Hello from test !! ");
	 *  }
	 */
	
}
