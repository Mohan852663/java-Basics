//lambda expression using as a parameter example
import java.util.*;
class Lambdaparameter
{
	public static void main(String[]args)
	{
		//cresting a arraylist
		ArrayList<String>list=new ArrayList<String>();
		//adding elements to the arraylist
		list.add("java");
		list.add("python");
		list.add("spring");
		list.add("css");
		System.out.println("the list is : "+list);
		
		//pass lambda expression to a parameter to replaceAll()method	
		list.replaceAll(l->l.toUpperCase());	
		System.out.println("updated list : "+list);
	}
}