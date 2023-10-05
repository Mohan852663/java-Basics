import java.io.*;
public class Createfile
{
	public static void main(String[]args)
	{
		try
		{
		File f=new File("test.txt");
		if(f.createNewFile()) //method to create new file
		{
			System.out.println(f+ " >>  the file creted ");
		}
		else
			System.out.println(f+ " >>  the file is not created");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}	
}