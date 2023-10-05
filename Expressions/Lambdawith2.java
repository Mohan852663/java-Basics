//with lambdaexpression example -2
interface intf
{
	public void m1(int a,int b);
}
public class Lambdawith2
{
	public static void main(String[]args)
	{
		//using Lambda expressions
		intf i=(a,b)->System.out.println("the sum is : "+(a+b));
		i.m1(20,40);
	}
}