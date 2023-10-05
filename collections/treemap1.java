//tree map example in java
import java.util.*;
public class treemap1
{
	public static void main(String[]args)
	{
		//creating a treeMap
		TreeMap t1=new TreeMap();
		
		//putting the elements to the treemap1
		t1.put("mohan", new Double(123.76));
		t1.put("ammi", new Double(1233.32));
		t1.put("yasmin", new Double(12.32));
		t1.put("yasin", new Double(134.26));
		t1.put("yas", new Double(12.85));
		
		//Get a set of the entries
		Set s=t1.entrySet();
		
		//Get an Iterator
		System.out.println("treemap elements is ...: ");
		Iterator i=s.iterator();
		while (i.hasNext())
		{
				Map.Entry me=(Map.Entry)i.next();
				System.out.println(me.getKey() +" : "+ me.getValue());
		}
		System.out.println();
		
		//deposit 1000 into mohan account
		 double balance =((Double)t1.get("mohan")).doubleValue();
		 t1.put("mohan", new Double(balance + 1000));
		 System.out.println("mohan's new balance is : "+t1.get("mohan"));	
		
	}
} 