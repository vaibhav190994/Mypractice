// Assignment 25 (Day9 Ass-2)
package package_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment25
{
	public void ReadDataRange(int initialrow, int endrow) throws IOException
	{
		File f=new File("../Autotest/src/package_1/inputfile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String s;
		int count=0;
		while((s=b.readLine())!=null)
		{
			count = count+1;
			if(count>=initialrow && count<=endrow)
			{
					System.out.println(s);
			}
		}						
	}
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Initial Row");
		int r1 = s.nextInt();
		System.out.println("Enter End Row");
		int r2 = s.nextInt();
		Assignment25 ob=new Assignment25();
		ob.ReadDataRange(r1, r2);
		
	}
}
