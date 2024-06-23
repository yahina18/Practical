package Spring_Core_Annotations.Practicals;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

	@Override
	public void teach(){
		// TODO Auto-generated method stub
		System.out.println("Hello your math here!!!");
		
	}
	
	 

}
