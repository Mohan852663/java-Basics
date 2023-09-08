//method overloading exaplme //differ from the automatic convention
class overloading4
{
	public void display(int i,char c){
		System.out.println("method a");
	}
	public void display(int i,double b){
		System.out.println("method b");
	}
	public void display(int i,int j){
System.out.println("method c ");
	}
}
public class sample4
{
	public static void main(String []args)
	{
		overloading4 obj=new overloading4();
		//if display(1,24.of)its not in the data type so trace for the higher data type 
		//and check the condition and display
		obj.display(12,54.0f);
	}
}