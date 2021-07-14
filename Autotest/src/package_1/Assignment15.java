// Day 7 Assignment 6 Print a table of any nubmer


package package_1;

import java.util.Scanner;

public class Assignment15 
{
	public void table()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No. to print Table");
		int n = s.nextInt();
		for(int i=1; i<=10; i++)
		{
			if(i==1)
			{
			System.out.println("Table of  " +n  +"\n");
			}
			System.out.println(n + " X " +i + " = "  +(n*i));
		}			
	}
	public static void main(String[] args) {
		Assignment15 ob=new Assignment15();
		ob.table();
	}
}
