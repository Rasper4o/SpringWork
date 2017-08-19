package com.tutorial;

public class HelloWorld {

	private String message;
	
	public void setMessage(String message)
	{
		this.message=message;
	}
	
	public void getMessage()
	{
		System.out.println("Your message: "+message);
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
