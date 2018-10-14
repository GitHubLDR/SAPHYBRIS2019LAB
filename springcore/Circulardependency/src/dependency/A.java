package dependency;

public class A {

	private B b;

	public A(B b) {
		super();
		this.b = b;
	}
	
	private void show() {
		System.out.println(b);

	}
}


