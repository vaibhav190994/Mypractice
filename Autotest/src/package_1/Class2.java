package package_1;

public class Class2 
{
	// Class 2 1st Program
	
	
//	int vaibhav;	// Global Variable
//	public void display1() {
//		vaibhav = vaibhav+1; // access global variable
//		int a=12;			// Local Variable
//		System.out.println(a+ "  Global  " +vaibhav);
//	}
//	
//	public void display2() {
//		vaibhav = vaibhav+1; // access global variable
//		//a= a+1;		// try to access local variable outside the method gives error
//		System.out.println(vaibhav);
//	}
//	public static void main(String[] args) {
//		Class2 vj=new Class2();
//		vj.display1();
//		vj.display2();
//	}
//	// Class 2 2nd Program
//	public void display1() {
//		int a=12;
//		System.out.println(a);
//	}
//	
//	public void display2(int a, int b) {
//		int c = a;
//		int d =  b;
//		System.out.println("Value of C is "+ c+"Value of d is"+ d);
//		
//	}
//	public static void main(String[] args) {
//		Class2 p=new Class2();
//		p.display1();
//		p.display2(12, 15);
//		}
	
	// Class 2 3rd Program
	public int sum(int a, int b) {
		System.out.println("result of sum is "+(a+b));
		return(a+b);
	}
	public int sub(int a, int b) {
		System.out.println("result of sub is" +(a-b));
		return(a-b);
	}
	public void mul(int a, int b) {
		System.out.println("Result is "+ (a*b));
	}
	public static void main(String[] args) {
		Class2 ob=new Class2();
		int c = ob.sub(10, 20);
		int d = ob.sum(10, 20);
		ob.mul(c, d);
		
	}
	
	
} 
