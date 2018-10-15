package newpackage;

public class Demo {

	private String str1;
	private int age;
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void call() {
		System.out.println("springsetter"+ str1+age);
		
	}
	
	
	
}
