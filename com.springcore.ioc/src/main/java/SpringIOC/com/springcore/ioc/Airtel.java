package SpringIOC.com.springcore.ioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		
		System.out.println("Calling from airtel");
		
	}

	@Override
	public void data() {
		
		System.out.println("browsing data from airtel ");
		
	}
	

	
}
