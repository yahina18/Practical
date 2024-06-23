package SpringIOC.com.springcore.ioc;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		
		System.out.println("Calling from vodafone !! ");
		
	}

	@Override
	public void data() {
		
		System.out.println("browsing data from vodafone !! ");
		
	}
	

	
}
