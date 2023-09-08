//returning the value methid using the return method
import java.util.Scanner;
public class Addiction
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number a is : ");
		int a=scan.nextInt();
		System.out.println("Enter the number b is : ");
		int b=scan.nextInt();
		//method 
		int c=add(a,b);
		System.out.println("The sum of the number is : "+c);
	}
	//user defined method 
		public static int add(int a,int b)
		{
			int s;
			s=a+b;
			return(s);  //retuening the valur into the main method
		}
}