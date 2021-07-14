// Assignment 27 (Day9 Ass-4)
package package_1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment27 
{
	public void WriteDataInaRange(int initial, int endrow) throws IOException
	{
		File f=new File("../Autotest/src/package_1/WriteDataInaRangefile.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=endrow; i++)
		{
			if(initial==1 || i<=(initial-1))
			{
				b.newLine();
			}
			else
			{
				System.out.println("Enter the data in " +i+" row");
				String st= s.nextLine();
				b.write(st);
				b.newLine();
			}		
		}
		System.out.println("you Succesfully wrote the file");
		b.close();
	}
	public static void main(String[] args) throws IOException {
		Assignment27 ob=new Assignment27();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting row");
		int sr = s.nextInt();
		System.out.println("Enter end row");
		int er = s.nextInt();
		ob.WriteDataInaRange(sr, er);
	}
}
