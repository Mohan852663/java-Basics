//without lambda expression example -2 
interface intf
{
	public void s1(int a,int b);
} 
class Demo implements intf
{
	public void s1(int a,int b)
	{
		System.out.println("The Sum is : "+(a+b));
	}
}
public class Lambdawithout2
{
	public static void main(String[]args)
	{
		intf i=new Demo();
		i.s1(20,40);
	}
}