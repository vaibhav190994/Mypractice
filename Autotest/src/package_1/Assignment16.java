// Day 7 Assignment 7 Factorial of a number

package package_1;

import java.util.Scanner;

public class Assignment16 {
	public void fact()
	{
		int original, fac=1;
		System.out.println("Enter the No. for Factorial");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		original = num;
		while(num>0)
		{
			fac=num * fac;
			num= num-1;
		}
		System.out.println("Factorial of number " +original +" is = " +fac);		
	}
	public static void main(String[] args) {
		Assignment16 ob=new Assignment16();
		ob.fact();
	}

}
