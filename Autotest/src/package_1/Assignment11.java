// Day 7 Assignment 2 Swaping without 3 rd variable

package package_1;

import java.util.Scanner;

public class Assignment11
{
	public void swap()
	{
		System.out.println("Enter the Value of 1st No. a");
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter the Value of 2nd No. b");
		int b = s.nextInt();
		System.out.println("No. Before Swapping is a = " +a);
		System.out.println("No. Before Swapping is b = " +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping 1st No. a is " +a);
		System.out.println("After Swapping 2nd No. b is " +b);
	}
	public static void main(String[] args)
	{
		Assignment11 ob=new Assignment11();
		ob.swap();
	}
}
