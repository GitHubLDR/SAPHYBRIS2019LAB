
public class ClassA {

	ClassB b;
	
	ClassA()
	{
		System.out.println("Class A is created");
	}
	public ClassB getB()
	{
		return b;
	}

	public void setB()
	{
		this.b=b;
	}
	void print()
	{
		System.out.println("hello A");
	}
	void display()
	{
		print();
		b.print();
	}
}
