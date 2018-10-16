package com.uhire.Hierarchical;

class Addition
{  
static int x=10,y=5,z;
void add()
{
	z = x + y;
	System.out.println("Addition:"+z);
}
} 
class Subtraction extends Addition
{  
void sub()
{
	 z = x - y;
	System.out.println("Subtraction:"+z);
	}  
}  
class Multiplication extends Addition
{  
void mul()
{
	 z = x * y;
	System.out.println("Multiplication:"+z);
	}  
}  
class Division extends Addition
{  
void Div()
{
	 z = x / y;
	System.out.println("division:"+z);
	}  
}  
class TestInheritance3
{  
public static void main(String args[])
{  
Addition a=new Addition();  
Subtraction s=new Subtraction();
Multiplication m=new Multiplication();
Division d=new Division();
a.add(); 
s.sub(); 
m.mul();
d.Div();

}}  