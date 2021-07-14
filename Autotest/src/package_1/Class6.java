// Class 6 Program 1 	// Method as final in parent class can't be override		

//package package_1;
//
//public class Class6
//{
//	public void first()
//	{
//		System.out.println("I am the first method");
//	}
//	
//	public final void second()
//	{
//		System.out.println("I am the final method");
//	}
//}





// Class 6 Program 2 	// Class as final can't be extends


//package package_1;
//
//public final class  Class6				// Decleraing class as final
//{
//	public void first()
//	{
//		System.out.println("I am the first method");
//	}
//	
//	public void second()
//	{
//		System.out.println("I am the final method");
//	}
//}




//Class 6 Program 3 	// Debugging of Java code


//package package_1;
//
//public final class  Class6			
//{
//	public void first()
//	{
//		System.out.println(" I am the first method");
//	}
//	
//	public void second()
//	{
//		System.out.println("I am the final method");
//	}
//	public static void main(String[] args) {
//		System.out.println("Inside main method");
//		Class6 ab=new Class6();
//		ab.first();
//		System.out.println("Main Method");
//		int a = 52;
//		System.out.println("a is "+a);
//		a =1256;
//		System.out.println("a is "+a);
//		ab.second();
//		System.out.println("last line of the main method");
//		
//	}
//	
//}




//Class 6 Program 4 	// Multiple objects of a class


//package package_1;
//
//public final class  Class6			
//{
//	int a;			// Global Variable 		Default value of Global var is 0
//	public void increment()
//	{
//		a  = a+1;		//	incrementing the value of a
//	}
//	public static void main(String[] args) {
//		System.out.println("Value of a for object1");
//		Class6 ob1=new Class6();
//		ob1.increment();
//		System.out.println(ob1.a);
//		System.out.println("Value of a for object2");
//		Class6 ob2=new Class6();
//		ob2.increment();
//		System.out.println(ob2.a);
//		System.out.println("Value of a for object3");
//		Class6 ob3=new Class6();
//		ob3.increment();
//		System.out.println(ob3.a);
//		ob3.increment();
//		System.out.println(ob3.a);
//	}
//	
//}


//Class 6 Program 5 	// Make static, memory will be allocated at class level


//package package_1;
//
//public final class  Class6			
//{
//	static int a;			// Global Variable 		Default value of Global var is 0
//	public void increment()
//	{
//		a  = a+1;		//	incrementing the value of a
//	}
//	public static void main(String[] args) {
//		System.out.println("Value of a for object1");
//		Class6 ob1=new Class6();
//		ob1.increment();
//		System.out.println(ob1.a);
//		System.out.println("Value of a for object2");
//		Class6 ob2=new Class6();
//		ob2.increment();
//		System.out.println(ob2.a);
//		System.out.println("Value of a for object3");
//		Class6 ob3=new Class6();
//		ob3.increment();
//		System.out.println(ob3.a);
//		ob3.increment();
//		System.out.println(ob3.a);
//	}
//	
//}

//Class 6 Program 6 	// Access of Static Method and variable by classname directly


//package package_1;
//
//public final class  Class6			
//{
//	static int a;			// Global Variable 	static	Default value of Global var is 0
//	public static void abc()
//	{
//		System.out.println("I am static method");
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("Value of a for object1");
//		Class6.abc();			// Calling of static method by classname direct
//		Class6.a=123;			// Calling of static variable by classnamme direct
//		System.out.println(Class6.a);
//	
//	}
//	
//}

//Class 6 Program 7 	// Overloading of Static method


//package package_1;
//
//public class  Class6			
//{
//	
//	public static void abc()		// staic method
//	{
//		System.out.println("I am static method");
//	}
//	
//	public static void abc(int a)		// staic method 2 for overloading
//	{
//		System.out.println("I am static method");
//	}
//	
//	public static void main()		// overloading of main method 
//	{
//		System.out.println("Overloading of the main method");
//	}
//	public static void main(String[] args) {
//		Class6.main();
//		
//	
//	}
//	
//}


//Class 6 Program  8	// Static method using only staic var and non staic use both


package package_1;

public class  Class6			
{
	int a;	// non static global var
	static int b;	// static var global var
	public static void abc()		// static method
	{
		//a = a+1;					// try to use non staic var in static method
		b = b+1;				// try to use static var in static method
		System.out.println(b);
		
	}
	
	public  void def()		// Non static method
	{
		a = a+1;		// using non static in non static method
		b = b+1;		// using static variable in non static method
		System.out.println(a);
	}

	public static void main(String[] args) {
		Class6.abc();		// calling static method by classname direct
		Class6 ab=new Class6();	//Making object to call non static method
		ab.def();
		
	
	}
	
}
