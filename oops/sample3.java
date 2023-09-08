//method overloading exaplme //differ from the sequence
class overloading3
{
	public void display(int i,char c){
		System.out.println(i+" hello "+c);
	}
	public void display(char c,int i){
		System.out.println(c+" hi bro "+i);
	}
}
public class sample3
{
	public static void main(String []args)
	{
		overloading3 obj=new overloading3();
		obj.display(12,'s');
		obj.display('h',56);
	}
}