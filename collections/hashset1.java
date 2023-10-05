//HashSet in java example
import java.util.*;
public class hashset1
{
	public static void main(String[]args)
	{
		HashSet<String> set1=new HashSet<String>();
		HashSet<String> set2=new HashSet<String>();
		Iterator i;
		set1.add("Apple");
		set1.add("orange");
		set1.add("Mango");
		set1.add("pineaple");
		set1.add("grape");
		
		System.out.println("set1 is ....: ");
		i=set1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//set 2 ---------------------------
		set2.add("potato");
		set2.add("tomato");
		set2.add("bringal");
		set2.add("onion");
		set2.add("avacado");
		
		System.out.println("set2 is .....: ");
		i=set2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("hash code for set2 : "+set2.hashCode());
		System.out.println("is equal is set2 | set2  : "+set1.equals(set2));
		System.out.println("size of the set 2 is :  "+set2.size());
	}
}