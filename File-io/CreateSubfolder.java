//create sub folder in a file
import java.io.*;
public class CreateSubfolder
{
	public static void main(String[]args)
	{
		File f1=new File("F:\\javacode\\File-io\\new\\a");
		boolean present =f1.exists();  //exists used for search the file already exists 
		System.out.println("folder present :"+present);
		
		if(present == false)
			f1.mkdirs();		//creating a sub folder using mkdirs
		
		present = f1.exists();
		System.out.println("present folder : "+ present);
			
	
			
	}
}