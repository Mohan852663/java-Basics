//dictionary class example
import java.util.*;
public class Dictionary1
{
	public static void main(String[]args)
	{
		Dictionary d=new Hashtable();	//doesnt not take a dictionary object so we can take the sub class of Dictionary is HAshtable
		System.out.println("Dictionary is empty :"+d.isEmpty());
		d.put("123","mohan");
		d.put("456","surya");
		d.put("789","ramesh");
		System.out.println("Dictionary size is  :"+d.size());
		System.out.println("obtain Dictonary keys");
		Enumeration key=d.keys();		//enumeration for keys ie: "123","456,"789"
		while(key.hasMoreElements())
		{
			System.out.println(key.nextElement());
		}
		System.out.println("obtain Dictionary values");
		Enumeration value=d.elements();
		while(value.hasMoreElements())
		{
			System.out.println(value.nextElement());
		}
		System.out.println(d);
		System.out.println("get value of key 789 : "+d.get("789"));
		System.out.println("get the key of surya : "+d.get("surya"));
	}
}