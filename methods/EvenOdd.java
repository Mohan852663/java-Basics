//EvenOdd program in java using the user defined methods
import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=scan.nextInt();
		//method calling
		findEvenOdd(num);
	}
	//user defined methods
	public static void findEvenOdd(int num)
	{
		//method body
		if(num%2==0){
			System.out.println("the number is even : "+num);
		}
		else{
			System.out.println("the number is Odd : "+num);
		}
	}
}