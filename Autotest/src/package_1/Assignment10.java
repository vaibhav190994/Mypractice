// Day 7 Assignment 1

package package_1;

import java.util.Scanner;

public class Assignment10 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Value of 1st No. a");
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter the Value of 2nd No. b");
		int b = s.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping 1st No. a is " +a);
		System.out.println("After Swapping 2nd No. b is " +b);
	}
}
