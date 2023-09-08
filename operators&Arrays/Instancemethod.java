//instance method in java for the user defined methods 
public class Instancemethod
{
	public static void main(String[]args)
	{
		//creating the object of the class
		Instancemethod obj=new Instancemethod();
		//invoking the instance method
		System.out.println("the sum is :"+obj.add(12,50));
	}
	int s;
		//user defined methods
		public int add(int a,int b)
		{
			int s = a+b;
			//returning the method 
			return s;
		}
}