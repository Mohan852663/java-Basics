//method over loading exapmple for java
//by the different number 
class overloading1
{
	public void display(int i){
		System.out.println(i);
	}
		public void display(int i,float f){
			System.out.println(i+" "+f);
		}
}
public class sample1
{
	public static void main(String []args)
	{
		overloading1 obj=new overloading1();
		obj.display(394);
		obj.display(678,10.0f);
	}
}