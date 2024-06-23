package com.Assignment.Question;

public class Airtel {
	
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void enableService()
	{
		service.service();
	}

}
