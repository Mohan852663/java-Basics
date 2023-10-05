//printing the file name  //create a file 
import java.io.*;
public class Filename
{
	public static void main(String[]args)
	{
		File f1=new File("F:\\javacode\\File-io\\new\\sample.txt"); //mention the file type"txt"
		boolean present =f1.exists();
		if(present ==false)
		try
		{
			boolean b = f1.createNewFile();
			System.out.println("File created :"+b);
		}
		catch(IOException e){
				System.out.println(e);
		}
		System.out.println("file name is :"+f1.getName());
	}	
}
	