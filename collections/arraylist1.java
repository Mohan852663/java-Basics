//arraylist traverse methods exapmle
import java.util.*;
public class arraylist1
{
	public static void main(String []args)
	{
		ArrayList<String> list=new ArrayList<String>();//creating arraylist1
		list.add ("apple");
		list.add ("orange");
		list.add ("mango");
		list.add ("banana");
		System.out.println(list);
		//traverse the arraylist using for each loop methods
		System.out.println("traverse the arraylist using for each loop methods");
		for(String mylist:list)
		{
			System.out.println(mylist);
		}
		//traverse the arraylist using iterator  methods
		Iterator i=list.iterator();
		System.out.println("traverse the arraylist using iterator  methods");
		while(i.hasNext())
		{
			System.out.println(i.next());//printing the element and move to next
		}
	}
}