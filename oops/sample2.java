//method over loading exapmple for java
//by the different datatype 
class overloading2
{
	public void display(int i){
		System.out.println(i);
	}
		public void display(char c){
			System.out.println(c);
		}
}
public class sample2
{
	public static void main(String []args)
	{
		overloading2 obj=new overloading2();
		obj.display(5);
		obj.display('a');
	}
}