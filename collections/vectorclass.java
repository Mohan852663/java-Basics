//vector class methods exapmle
import java.util.*;
class vectorclass
{
	public static void main(String[]args)
	{
		vector list =new vector();
		list.add("C");				//added in index 0
		list.add("c++");			//added at index 1
		list.add("java");			//added at index 2
		list.add("python");			//added  at index 3
		list.insertElementAt("django",3);	//inserted at index 3 so ,the index 3 pyhton has moved to index 4
		list.addElement(".net");	//added at index 5
		list.addElement("ui/ux");	//added at index 6
		list.addElement("AI");	//added at index 7
		list.removeElementAt(5);	//index 5 .net has removed
		list.removeElement("c++");	//element c++ removed which means index 1
		System.out.println("vector capacity = "+list.capacity());
		System.out.println("vector size = "+list.size());
		System.out.println("list of languages");
		for(int i=0;i<list.size();i++)
		{
			System.out.printn(list.get(i));  //which get(i) get print all the i values 
		}
		System.out.printn("first element is : " +list.firstElement());
		System.out.printn("last element is : " +list.lastElement());
		System.out.printn("elements at index 2 is : " +list.elementAt(2));
		System.out.printn("elements at index 5 is : " +list.elementAt(5));
		Enumeration e=list.elements();
		System.out.println("Traverse the elements using Enumeration");
		while(e1.hasMoreElements())
			System.out.println(e1.nextElement()); 
	}
}