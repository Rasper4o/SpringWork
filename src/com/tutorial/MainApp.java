package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld object1=(HelloWorld) context.getBean("helloWorld");
		object1.getMessage1();
		object1.getMessage2();
		
		System.out.println();
		
		HelloBulgaria object2 = (HelloBulgaria) context.getBean("helloBulgaria");
		object2.getMessage1();
		object2.getMessage2();
		object2.getMessage3();
	}
}
