// Class 8 program 1		Pattern 1
//package package_1;
//
//public class Class8 
//{
//	public static void main(String[] args) 
//	{
//		for(int i=1;i<=5;i++)				// for row print
//		{
//			for(int j=1;j<=i;j++)			//for column print with pattern
//			{
//				System.out.print("*");
//			}
//			System.out.println();		// will move to the next line
//		}
//	}
//}


//Class 8 program 2		Command line argument
package package_1;

public class Class8 
{
	public static void main(String[] vaibhav) 		//main method (args is ref variable)
	{
		System.out.println("total  arguments");
		System.out.println(vaibhav.length);			// to check the no. of arguments
		for(int i=0; i<vaibhav.length; i++)		// for printing all arguments
		{
			System.out.println(vaibhav[i]);		// to print ith element of the array vaibhav
		}
	}
}
