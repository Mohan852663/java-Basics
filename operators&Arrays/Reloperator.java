//relational operator java
/*
<
>
<=
>=
==
!=
*/

public class Reloperator
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=20;
		int d=0;
		int e=0;
		if(a>b) //10>5 - true
		{
			d=100;
		}
		if(a<b) //10<5 - false
		{
			d=10;
		}
		if(a==c) //10==20 - false
		{
			d=0;
		}
		if(a<=c) //10<= 20 - true
		{
			e=100;
		}
		if(a>=b) //10>= 5 - true
		{
			
			d=1000;
		}
		if(a!=c) //10!=20 - true
		{
			e=0;
		}
		System.out.println("a value is ="+a);
		System.out.println("b value is ="+b);
		System.out.println("c value is ="+c);
		System.out.println("d value is ="+d);
		System.out.println("e value is ="+e);
	}
	
}