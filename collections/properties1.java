// expamle for properties for java
import java.util.*;
public class properties1
{
	public static void main(String[]args)
	{
		Properties p1=new Properties();
		Set set;
		String str;
		p1.put("Tamilnadu","chennai");
		p1.put("madurai","vilupuram");
		p1.put("kandhipuram","pallavaram");
		p1.put("Ramnad","thudiyalur");
		System.out.println(p1);
		set=p1.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			System.out.println("p1 is the"+i.next());
		}
		System.out.println("capital of madurai"+p1.getProperty("madurai","not found"));
	}
}