package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld object1=(HelloWorld) context.getBean("helloWorld");
		
		object1.setMessage("I am object 1");
		object1.getMessage();
		
		HelloWorld object2 = (HelloWorld) context.getBean("helloWorld");
		
		object2.getMessage();
	}
}
