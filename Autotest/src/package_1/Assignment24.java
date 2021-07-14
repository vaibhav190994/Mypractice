// Assignment 24 (Day9 Ass-1)
package package_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment24 
{
		public void ReadData(int row) throws IOException
		{		
			File f=new File("../Autotest/src/package_1/inputfile.txt");
			FileReader fr=new FileReader(f);
			BufferedReader b=new BufferedReader(fr);
			String s;
			int count = 0;
			//System.out.println("Hello");
			while((s=b.readLine())!=null)
			{
				count++;
				if(count==row)
				{
					System.out.println(s);
					break;
				}				
			}
			if((row>count) || (row<=0))
			{
				System.out.println("Enter a valid row number");
			}	
		}
		public static void main(String[] args) throws IOException {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter row Number to read the data");
			int a = s.nextInt();
			Assignment24 ob=new Assignment24();
			ob.ReadData(a);
		}
}
