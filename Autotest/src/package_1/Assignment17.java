// Day 7 Assignment 8 Fibonaci Series

package package_1;

import java.util.Scanner;

public class Assignment17 {
public static void main(String[] args) {
	int n1=0,n2=1,n3;
	Scanner s=new Scanner(System.in);
	int num = s.nextInt();
	System.out.print(n1+" " +n2);
	for(int i=2;i<num; i++)
	{
		n3 =n1+n2;
		System.out.print(" "+n3);
		n1 = n2;
		n2 = n3;
	}
}
}
