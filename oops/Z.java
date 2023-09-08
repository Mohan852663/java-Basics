//multilevel inheritance example in java
class X
{
	public void methodX(){
		System.out.println("grand parent");
	}
}
class Y extends X
{
	public void methodY(){
		System.out.println("parent class");
	}
}
class Z extends Y
{
	public void methodZ(){
		System.out.println("child class");
	}
	public static void main(String[] args)
	{
		Z obj=new Z();
		obj.methodX();	//calling its grand parent
		obj.methodY();	//calling its parent
		obj.methodZ();	//calling its child
	}
}