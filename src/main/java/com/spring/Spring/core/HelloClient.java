package com.spring.Spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {

	public static void main(String args[])
	{
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Employee empl=(Employee)ctx.getBean("emp",Employee.class);
		System.out.println(empl);
	}
	
}
