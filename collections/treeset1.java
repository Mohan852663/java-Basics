//Treeset example in java
import java.util.*;
public class treeset1
{
	public static void main(String[]args)
	{
		//creating the treeset
		TreeSet t1=new TreeSet();
		
		//add elements to the treeset
		t1.add("a");
		t1.add("b");
		t1.add("c");
		t1.add("d");
		t1.add("e");
		t1.add("f");
		System.out.println("the size of the t1 is : "+t1.size());
		System.out.println(t1);
	}
}