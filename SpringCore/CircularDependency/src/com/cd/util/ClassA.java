package com.cd.util;

public class ClassA {

	private ClassB b;

	public ClassB getB() {
		return b;
	}

	public void setB(ClassB b) {
		this.b = b;
	}
	
	public ClassA(ClassB b)
	{
		super();
		this.b=b;
	}
	
	public void show()
	{
		System.out.println(b);
	}
	
	
}
