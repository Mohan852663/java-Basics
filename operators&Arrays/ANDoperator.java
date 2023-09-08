//AND operator in java


public class ANDoperator
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a<b&&b<c); //10<5(false)&&5<20(true)- false
		System.out.println(b<a&c<b); //5<20(true)&20<10(false)-  false	
	}
}