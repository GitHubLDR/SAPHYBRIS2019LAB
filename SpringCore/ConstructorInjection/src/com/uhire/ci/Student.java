package com.uhire.ci;

public class Student {
	
	private int id;
	private String name;
	
	public Student()
	{
		System.out.println("Student Details");
	}
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public void display()
	{
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
	}

}
