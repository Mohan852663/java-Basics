//java program for the check the directory or file exapmle
import java.io.*;
public class Filemethods2
{
	public static void main(String[]args)
	{
		//File f=new File("Filemethods2.java");
		File f=new File("F:/javacode");
		
		if(f.isFile())
		{
			System.out.println(" it is a file ");
		}
		else if(f.isDirectory())
		{
			System.out.println(" it is a directory ");
		}
		else
		{
			System.out.println("it is a dummy fake file");
		}
	}	
}