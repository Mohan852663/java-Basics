//accessor method and mutator methods in the instance method example program
public class Student
{
	private int roll;
	private String name;
	public int getRoll()	//accessor method
	{
		return roll;
	}
	public void setRoll(int roll)	//mutator method
	{
		this.roll=roll;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("roll number is :"+ roll);
		System.out.println("name is : "+name);
	}
	public static void main(String[]args)
	{
		Student std=new Student();
		std.setRoll(17);
		std.setname("mohan");
		std.display();
	}
}