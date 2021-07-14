// Day 7 Assignment 4 Check no. is palindrome or not


package package_1;
import java.util.Scanner;
public class Assignment13 
{
	public void palindrome()
	{
		int reverse =0, remainder, original;
		System.out.println("Enter a Number");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		original = num;
		while(num>0)
		{
			remainder = num%10;
			reverse = (reverse * 10) + remainder;
			num = num/10;
		}
		if(reverse==original)
		{
			System.out.println("No. is Palindrome");
		}
		else
		{
			System.out.println("No. is not palindrome");
		}				
	}
	
	public static void main(String[] args) 
	{
		Assignment13 ob=new Assignment13();
		ob.palindrome();
	}
}
