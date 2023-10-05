//example for hashtable class
import java.util.*;
public class Hashtable1
{
	public static void main(String[]args)
	{
		Hashtable<String,String> h1=new Hashtable<String,String>();
		h1.put("123","mohan");
		h1.put("456","surya");
		h1.put("789","raahul");
		h1.put("098","sowndhar");
		System.out.println("Enumerate the keys....");
		Enumeration e=h1.keys();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("Enumerate the values...");
		e=h1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("using map interface obtain the key/value pair");
		for(Map.Entry m:h1.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		h1.remove("098");
		System.out.println("show the values after remove the (098) : "+h1);
	}
}