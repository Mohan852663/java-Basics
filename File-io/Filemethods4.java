//creating a directory method exapmle in file methods
import java.io.*;
public class Filemethods4
{
	public static void main(String[]args)
	{
		File f=new File("inmakes");
		if(f.mkdir())
		{
			System.out.println(f+" : directory is created");
		}
		else
		{
			System.out.println(f+" : directory is not created");
		}
	}
}