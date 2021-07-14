// Day 7 Assignment 3 Check no. is prime or not

package package_1;

import java.util.Scanner;

public class Assignment12
{
	public void prime()
	{
		System.out.println("Enter a Number");
		Scanner s=new Scanner(System.in);
		int a = s.nextInt();
		int vaibhav=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println("No. is Not Prime");
				vaibhav=1;
				break;
			}
			
		}
		if(vaibhav==0)
		{
			System.out.println("No. is Prime");
			
		}
		
	}
	public static void main(String[] args) 
	{
		Assignment12 ob=new Assignment12();
		ob.prime();
				
	}
}
