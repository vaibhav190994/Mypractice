// Class 5  Program 1  Static Polymorhism OR Method overloading

//package package_1;
//
//public class Class5 
//{
//	public void arithmetic(int a, int b)		// method with two argument
//	{
//		int c;
//		c = a + b;
//		System.out.println("Result is " +c);
//	}
//	
//	public int arithmetic(int a, int b, int c)	// method with same name with diff data types
//	{
//		int d;
//		d = a + b + c;
//		System.out.println("Result is " +d);
//		return d;
//	}
//	
//	public static void main(String[] args) {
//		Class5 ob=new Class5();
//		ob.arithmetic(12, 15);
//		ob.arithmetic(1, 2, 9);
//	}
//}




//Class 5  Program 2 Part 1   Dynamic Polymorhism OR Method overriding

//package package_1;
//
//public class Class5 
//{
//	public void brandName()		// method one	{
//	{	
//		System.out.println("Brand Name is Maruti");
//	}
//	
//	public void price(int price)		// method two
//	{	
//		System.out.println("Price is " +price);
//	}
//	
//}



//Class 5  Program 3   Scanner Class

//package package_1;
//
//import java.util.Scanner;
//
//public class Class5 
//{
//	public static void main(String[] args) {
//		System.out.println("Please enter Value of a");
//		Scanner s=new Scanner(System.in);		// has a relationship
//		int a = s.nextInt();					// integer value taken
//		System.out.println("Value of a is "+a);
//		System.out.println("Please enter Value of b");
//		float b = s.nextFloat();				// float value taken
//		System.out.println("Value of b is "+b);
//		System.out.println("Please enter String");
//		String d = s.next();					// string input from user
//		System.out.println("String is "+d);
//	}	
//
//}




//Class 5  Program 4   Implicit Conversion

//package package_1;
//
//public class Class5 
//{
//	public static void main(String[] args) {
//		int a =12;
//		float b;
//		b = a;					// implicit conversion
//		System.out.println("Value of b is "+b);
//	}	
//
//}



//Class 5  Program 5   Explicit Conversion

package package_1;

public class Class5 
{
	public static void main(String[] args) {
		float f = 12.4F;
		int a;
		a = (int)f;					// Explicit  conversion
		System.out.println("Value of a is "+a);
	}	

}