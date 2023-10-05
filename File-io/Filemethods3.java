//java delete method in file methods in java
import java.io.*;
public class Filemethods3
{
	public static void main(String[]args)
	{
		File f=new File("Filemethods1.java");//creats a own file
		if(f.exists())
		{
			System.out.println(f+" : the file is exist");
			System.out.println("size of the file :"+f.length()+ "  bytes");
			
			boolean isDeleted = f.delete(); //method for delete
			if(isDeleted)
			{
				System.out.println("File deleted");
			}
			else
			{
				System.out.println("File is not deleted");
			}
		}
		else
		{
			System.out.println(f+" the file is not exist");
		}
	}
}