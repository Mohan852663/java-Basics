//file deletion method
import java.io.*;
public class Filedelete
{
	public static void main(String[]args)
	{
		File f1=new File("Filerename.java");
		if(f1.exists())
		{
			System.out.println("the file is existed");
		}
		elseif(f1.delete())//method to delete
		{
			System.out.println("the file is deleted");
		}
		else {
			System.out.println("file is not deleted");
		}
	}
}
//its not worked at secod  tym bcoz the specified file is deleted in the first attempt