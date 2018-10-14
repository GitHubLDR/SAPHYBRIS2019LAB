package com.uhire.util;
 
public class A {
	
	public A()
	{
		System.out.println("Creating instance of a");
	}
	

	@SuppressWarnings("unused")
	private B b;
	
	public void setB(B b)
	{
		System.out.println("Setting property b of A instance");
		this.b=b;
	}
}
	