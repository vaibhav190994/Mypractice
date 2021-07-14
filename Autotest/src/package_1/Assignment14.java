
// Day 7 Assignment 5 Check no. is Armstrong or not

package package_1;

import java.util.Scanner;

public class Assignment14 
{
	public void armstrong()
	{
		int original, remainder, sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number to verify");
		int num = s.nextInt();
		original = num;
		while(num > 0)
		{
			remainder = num%10;
			sum = sum +(remainder * remainder * remainder);
			num = num/10;
		}
		
		if(sum == original)
		{
			System.out.println("No. is Armstrong");
		}
		else
		{
			System.out.println("No. is Not Armstrong");
		}
	}
	
	public static void main(String[] args) {
		Assignment14 ref=new Assignment14();
		ref.armstrong();
	}
}
