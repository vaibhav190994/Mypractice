package package_1;

public class Ass7child extends Ass7parent {
	public void mc1() {
		this.mc4(12, 45, 96);
		System.out.println("Child Default Method");
	}
	public void mc2(int a) {
		this.mc3(12, 15);
		System.out.println("Child 1 parameterized Method");
	}
	public void mc3(int a, int b) {
		this.mc1();
		System.out.println("Child 2 parameterized Method");
	}
	public void mc4(int a, int b, int c) {
		System.out.println("Child 3 parameterized Method");
	}
	public void mc5(int a, int b, int c, int d) {
		super.m5(12,58,69,89);
		this.mc2(78);
		System.out.println("Child 4 parameterized Method");
	}
	public static void main(String[] args) {
		Ass7child ob=new Ass7child();
		ob.mc5(12,25,36,39);
		//ob.m1();
	}
}
