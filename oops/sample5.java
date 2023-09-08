//overriding methid in java
class vehicle
{
	public void drive(){
		System.out.println("vehicle is driven");
	}
}
class car extends vehicle
{
	public void drive(){
		System.out.println("car is driven");
	}
}
public class sample5
{
	public static void main(String[]args)
	{
		car obj=new car();
		//this will call the child version of drive();
		obj.drive();
	}
}