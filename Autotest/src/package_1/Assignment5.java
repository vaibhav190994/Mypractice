package package_1;

public class Assignment5 
{
	public void m1() {
		System.out.println("This is Default Method");
	}
	public void m2(int a) {
		this.m5(15, 45, 47, 85);
		System.out.println("This is 1 Parameterised Method");
	}
	public void m3(int a, int b) {
		this.m4(12, 14, 16);
		System.out.println("This is 2 Parameterised Method");
	}
	public void m4(int a, int b, int c) {
		this.m2(52);
		System.out.println("This is 3 Parameterised Method");
	}
	public void m5(int a, int b, int c, int d) {
		this.m1();
		System.out.println("This is 4 Parameterised Method");
	}
	public static void main(String[] args) {
		Assignment5 ob=new Assignment5();
		ob.m3(12, 14);
	}
}
