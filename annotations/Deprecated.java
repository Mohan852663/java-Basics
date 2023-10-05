//deprecated example in java 
class A
{
	void m()
	{
		System.out.println("print m");
	}
	@Deprecated
	void n()
	{
		System.out.println("print n");
	}
}
public class Deprecated
{
	public static void main(String[]args)
	{
		A a=new A();
		a.n();
	}
}

