package SpringCore.autoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octpousHeart")	
	private Heart heart;
	
	public Human(){}
	
	  // @Autowire with cons
	public Human(Heart heart)
	{
		this.heart = heart;
		
	}
	
	// if @autowire annotation before dependencies so spring create dependency without using setter method.
	public void setHeart(Heart heart) {
		this.heart = heart; 
	    System.out.println("Setter method called !! ");	
	}
	
    
	public void startPumping()
	{
		if(heart != null) {
			
			heart.pump();
			System.out.println("name of the animal is : "+heart.getNameOfAnimal()+
					" no of heart : "+heart.getNoOfHeart());
		}
			
		   
		else {
			System.out.println("Please initalize heart first !! ");
		}
	}
	//@Autowire Used by default byType if byType failed its used byName.

}
