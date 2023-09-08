//overriding method example
class A
{
	public void disp(){
		System.out.println("disp parent class is printed");
	}
}
class B extends A
{
	public void disp(){
		System.out.println("disp child class is printed");
	}
	public void newmethod(){
		System.out.println("new method child is printed");
	}
}
public class sample6
{
	public static void main(String []args)
	{
		A obj=new A();
		obj.disp();
		
		A obj2=new B();
		obj2.disp();
	}
}