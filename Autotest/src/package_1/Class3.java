package package_1;
// Class 2 Program 1
//public class Class3 
//{
//	public Class3() 	// ()indicates----> method
//	{
//		System.out.println("Default Constructor");
//	}
//	
//	public Class3(int a) 
//	{
//		System.out.println("One Parameterized Constructor");
//	}
//	
//	public Class3(int a, int b) 
//	{
//		System.out.println("Two Parameterized Constructor");
//	}
//	
//	public static void main(String[] args) 
//	{
//		Class3 ref=new Class3();	// object 1 created
//		Class3 ref2=new Class3(5);	// object 2 created
//		Class3 ref3=new Class3(55,9);	// object 3 created
//	}
//}


//Class 2 Program 2
//public class Class3 
//{
//	public Class3() 	// ()indicates----> method
//	{
//		System.out.println("Default Constructor");
//	}
//	
//	public Class3(int a) 
//	{
//		this(12,25); // control to to 2 parameterized constructor using this keyword
//		System.out.println("One Parameterized Constructor");
//	}
//	
//	public Class3(int a, int b) 
//	{
//		this(); // it will call default constructor
//		System.out.println("Two Parameterized Constructor");
//	}
//	
//	public static void main(String[] args) 
//	{
//		Class3 ref=new Class3(12);	// control will go to one parameterized const
//	}
//}


//Class 2 Program 3
//public class Class3 
//{
//	public void m1()
//	{
//		this.m2();           //call the method2
//		System.out.println("I am First Method");
//		this.m2();           //call the method2
//	}
//	
//	public void m2()
//	{
//		System.out.println("I am Second Method");
//	}
//	
//	public static void main(String[] args) {
//		Class3 ob=new Class3();
//		ob.m1();	// call the method1
//	}
//}



//Class 2 Program 4
//public class Class3 
//{
//	int deepak; 	// Global Variable
//	public void m1(int deepak)	//deepak----local variable
//	{
//		this.deepak=deepak;		//this.deepak global variable
//	}
//	public static void main(String[] args) {
//		Class3 ref=new Class3();
//		System.out.println(ref.deepak);// print global variable
//		ref.m1(123);
//		System.out.println(ref.deepak);
//	}
//}


//Class 2 Program 5
public class Class3 
{
	final int arjun=123;	// constant decleration arjun
	//int arjun; //global variable
	public static void main(String[] args) {
		Class3 ob=new Class3();
		//ob.arjun=123;		// cant change bcs arjun is constant
		System.out.println(ob.arjun);
		//ob.arjun=256;		// cant change bcs arjun is constant
		System.out.println(ob.arjun);
	}
}
		