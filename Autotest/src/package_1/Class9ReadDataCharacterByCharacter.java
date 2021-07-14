//// Class 9 Program 1		ReadDataCharacterbycharacter
//
//package package_1;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Class9ReadDataCharacterByCharacter 
//{
//	public static void main(String[] args) throws IOException
//	{
//		File f=new File("../Autotest/src/package_1/inputfile.txt");	// creating connection with file
//		FileReader fr=new FileReader(f);
//		BufferedReader b=new BufferedReader(fr);	// for reading data line by line
//		int a;
//		while((a=fr.read())!=-1)		//-1 indicate end of file for reading char by char
//		{
//			 System.out.println((char)a);		// explicit conversion of ascii into character
//		}
//	
//		
//	}
//}

////Class 9 Program 2		Read Data Line by Line

//package package_1;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Class9ReadDataCharacterByCharacter 
//{
//	public static void main(String[] args) throws IOException
//	{
//		File f=new File("../Autotest/src/package_1/inputfile.txt");	// creating connection with file
//		FileReader fr=new FileReader(f);
//		BufferedReader b=new BufferedReader(fr);	// for reading data line by line
//		String s;
//		while((s=b.readLine())!=null)	// for reading data line by line
//		{
//			 System.out.println(s);	
//		}
//		
//	}
//}



////Class 9 Program 3		Write Data

package package_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Class9ReadDataCharacterByCharacter 
{
public static void main(String[] args) throws IOException
{
	File f=new File("../Autotest/src/package_1/outputFile.txt");	// creating connection with file
	FileWriter fw=new FileWriter(f);	
	BufferedWriter b=new BufferedWriter(fw);		// writing line by line
	b.write("my name is vaibhav");		// for writing in file
	b.newLine();						// for new line
	b.write("Automation is very easy");
	b.close();			// for saving and closing of file
	
	
}
}
