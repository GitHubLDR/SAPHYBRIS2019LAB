package com.uniquehire.springcore;

public class Restaurant {

	public void greetCustomer() {
		
		System.out.println("LifeCycle Demo");
	}
	public void init( ) {
		System.out.println("Restaurant Bean is goint to init.");
	}
	public void destroy( ) {
		System.out.println("Bean will destroy now.");
	}
}
