package com.tutorial;

public class HelloWorld {

	private String message1;
	private String message2;
	
	public void setMessage1(String message)
	{
		message1=message;
	}
	
	public void setMessage2(String message) {
		message2 = message;
	}

	public void getMessage1()
	{
		System.out.println("Message 1 is: "+message1);
	}
	
	public void getMessage2() 
	{
		System.out.println("Message 2 is: "+message2);
	}
	
	public void init()
	{
		System.out.println("Bean is going though init.");
	}
	
	public void destroy()
	{
		System.out.println("Bean will be destroyed now.");
	}
}
