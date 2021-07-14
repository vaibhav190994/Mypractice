// Class10 Program1			// conversion of string into integer

//package package_1;
//
//public class Class10 
//{
//	public static void main(String[] args) {
//		String s = "1234";	// String.....integer
//		Integer i=Integer.parseInt(s);
//		System.out.println(i);		// now it is a integer
//	}
//}


//Class10 Program2	// Conversion of integer into string

package package_1;

public class Class10 
{
	public static void main(String[] args) {
		Integer i =123;		// i is reference variable
		String s =i.toString();		// convert integer into string
		System.out.println(s);
	}
}
