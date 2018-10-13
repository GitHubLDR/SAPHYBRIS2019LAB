package com.spring;

public class Demo 
{	
private String msg;
private String construct;
@SuppressWarnings("unused")
private Sample smpl;
private int str1;

public Demo(String msg,int str1)
{
	this.msg=msg;
	this.str1=str1;
	System.out.println("constructor 1 is calling");
}

public Demo(int str1,String msg)
{
	this.str1=str1;
	this.msg=msg;
	System.out.println("Constructor 2 is calling");
	
}

public void show()
{
	   System.out.println("Msg: "+msg);
	   System.out.println("Construct: "+construct);
	   System.out.println("Str1: "+str1);
	
}}
