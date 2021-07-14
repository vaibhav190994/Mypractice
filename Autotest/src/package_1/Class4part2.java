// Class4 Program 1 Part2 Single Level Inheritance

//package package_1;
//
//public class Class4part2 extends Class4
//{
//
//	public void model()
//	{
//		System.out.println("Type is Swift");
//	}
//
//public static void main(String[] args) {
//	Class4part2 ob=new Class4part2();
//	ob.model();
//	ob.price();
//}
//}


//Class4 Program 2 Part2 Multi Level Inheritance

//package package_1;
//
//public class Class4part2 extends Class4
//{
//	public void m2()
//	{
//		System.out.println("I am the Parent Class");
//	}
//}

//Class4 Program 3 Part2 Hierarchical Inheritance

//package package_1;
//
//public class Class4part2 extends Class4
//{
//	public void m2()
//	{
//		System.out.println("I am the Child1");
//	}
//	public static void main(String[] args) 
//	{
//		Class4part2 ob=new Class4part2();
//		ob.m2();
//		ob.method1();
//	}
//}

//Class4 Program 4 Part2 Inheritance with Constructor & Using of Super

//package package_1;
//
//public class Class4part2 extends Class4
//{
//	public Class4part2()
//	{
//		System.out.println("Child Default Constructor");
//	}
//	public Class4part2(int a)
//	{
//		System.out.println("Child one parameterized Constructor");
//	}
//	public Class4part2(int a, int b)
//	{
//		super(12);		// parent 1 parameterized call  super keyword
//		System.out.println("Child two parameterized Constructor");
//	}
//	public static void main(String[] args) {
//		Class4part2 s=new Class4part2(3,4);	// control child 2 parameterized
//		
//	}
//}


//Class4 Program 5 Part2 Super keywords with methods

package package_1;

public class Class4part2 extends Class4
{
	public void third()
	{
		super.method1();		// call the parent method using super
		System.out.println("Child class method");
		super.method2();		// call the parent method using super
	}
	
	public static void main(String[] args) {
		Class4part2 s=new Class4part2();
		s.third();	// called the child method
	}
}
