//abstract method in java
abstract class Abclass     //this is the abstract class
{
	abstract void display();
}
public class myclass extends Abclass
{
	//method implementation
	void display(){
		System.out.println("abstract class method....");
	}
	public static void main(String[]args)
	{
		//creating a obj to abstract class
		Abclass obj=new myclass();
		//invoking adstract method 
		obj.display();
	}
}