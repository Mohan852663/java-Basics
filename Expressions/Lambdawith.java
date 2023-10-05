//with lambda expression
interface intf
{
	public void m1();
}
class Lambdawith
{
	public static void main(String[]args)
	{
	//using Lambda expression 
	
	intf i=()->System.out.println("print the M1");
	i.m1();
	}
}