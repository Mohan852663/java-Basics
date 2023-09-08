//example for single inheritance using a parent class and child class
class A
{
	public void methodA(){
		System.out.println("its a parent class");
	}
}
class B extends A
{
	public void methodB(){
		System.out.println("its a child class");
	}
	public static void main(String []args)
	{
		A objA=new A();
		B objB=new B();
		objA.methodA();		//obj a call its local methodA
		objB.methodA();		//obj b call its parent method
		objB.methodB();		//obj b call its local method
	}
}