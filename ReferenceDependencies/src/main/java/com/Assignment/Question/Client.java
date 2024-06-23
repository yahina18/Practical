package com.Assignment.Question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Airtel airtel = context.getBean("airtel" ,Airtel.class);
        airtel.enableService();
		
		
	}

}
