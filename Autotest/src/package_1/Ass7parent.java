package package_1;

public class Ass7parent {
	public void m1() {
		System.out.println("Parent Default Method");
	}
	public void m2(int a) {
		this.m1();
		System.out.println("Parent 1 parameterized Method");
	}
	public void m3(int a, int b) {
		this.m4(12, 25, 98);
		System.out.println("Parent 2 parameterized Method");
	}
	public void m4(int a, int b, int c) {
		this.m2(12);
		System.out.println("Parent 3 parameterized Method");
	}
	public void m5(int a, int b, int c, int d) {
		this.m3(25, 69);
		System.out.println("Parent 4 parameterized Method");
	}
}
