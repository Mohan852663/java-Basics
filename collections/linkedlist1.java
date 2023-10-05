//linked list example using in java 
import java.util.*;
public class linkedlist1
{
	public static void main(String[]args)
	{
		LinkedList<Integer> li=new LinkedList<Integer>();//creating linkedlist1
		li.add(123);
		li.add(456);
		li.add(789);
		li.add(198);
		li.add(567);
		li.addFirst(0001);
		li.addLast(9999);
		System.out.println(li);
		for(Integer i:li)
		{
			System.out.println(i);//used to print in loop format
		}
		li.removeFirst();
		li.removeLast();
		
		//traverse a linked list in forward list iterator
		ListIterator list=li.listIterator();
		System.out.println("traverse a linked list in forward list iterator");
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		//traverse a linked list in backword list iterator
		System.out.println("traverse a linked list in backword list iterator");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}	
	}
}