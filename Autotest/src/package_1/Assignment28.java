// Assignment 28 (Day9 Ass-5)
package package_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment28
{
	public void ReadWrite() throws IOException
	{
		File rf=new File("../Autotest/src/package_1/inputfile.txt");
		FileReader f=new FileReader(rf);
		BufferedReader br=new BufferedReader(f);
		
		File wf=new File("../Autotest/src/package_1/copyfile.txt");
		FileWriter fw=new FileWriter(wf);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		
	}
	public static void main(String[] args) throws IOException {
		Assignment28 ob=new Assignment28();
		ob.ReadWrite();
	}
}
