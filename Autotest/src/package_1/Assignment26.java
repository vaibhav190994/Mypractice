// Assignment 26 (Day9 Ass-3)
package package_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment26
{
	public void WriteData(int rowcount) throws IOException
	{
		File f=new File("../Autotest/src/package_1/WriteDatafile.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter br=new BufferedWriter(fw);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data to write inside the file");
		for(int i=1;i<=rowcount; i++)
		{
			String st = sc.nextLine();
			br.write(st);
			br.newLine();
		}
		System.out.println("You have succesfully write the data");
		br.close();
	}
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = s.nextInt();
		Assignment26 ob=new Assignment26();
		ob.WriteData(n);
	}
}
