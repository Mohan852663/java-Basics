//without lambda expression
interface intf
{
	public void m1();
}
class Demo implements intf
{
	public void m1()
	{
		System.out.println("print the M1");
	}
}
class Lambdawithout
{
	public static void main(String[]args)
	{
		intf i=new Demo();
		i.m1();
	}
}