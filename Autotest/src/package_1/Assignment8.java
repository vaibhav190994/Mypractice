// Assignment 8 (((((x1*x2)+x3)+x4)-x5)/x6)
package package_1;
import java.util.Scanner;
public class Assignment8 
{
	public int mul(int x1, int x2) {
		return(x1*x2);
	}
	public int add(int a, int b) {
		return(a+b);
	}
	public int sub(int a, int b) {
		return(a-b);
	}
	public int div(int a, int b) {
		return(a/b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value of X1");
		int x1 = s.nextInt();
		System.out.println("Enter the Value of X2");
		int x2 = s.nextInt();
		System.out.println("Enter the Value of X3");
		int x3 = s.nextInt();
		System.out.println("Enter the Value of X4");
		int x4 = s.nextInt();
		System.out.println("Enter the Value of X5");
		int x5 = s.nextInt();
		System.out.println("Enter the Value of X6");
		int x6 = s.nextInt();
		Assignment8 ob= new Assignment8();
		int d = ob.mul(x1, x2);
		int e = ob.add(d, x3);
		int f = ob.add(e, x4);
		int g = ob.sub(f, x5);
		float h = ob.div(g, x6);
		System.out.println("Result is"+h);
	}
}
