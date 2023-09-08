//instance metghod example in java
public class Instancemethod
{
	public static void main(String[]args)
	{
		//creating an object in the class 
		Instancemethod obj=new Instancemethod();
		//invoking the instance method
		System.out.println("the sum is :"+obj.add(10,50));
	}	
		//user defined method 
		//used a static keyword
		int s;
		public int add(int a,int b);
		{
		
		s=a+b;
		return s;
		}
}