//java program for the parameterized consrtructors
class Employe
{
	int Eid;
	String Ename;
	int Eage;
	//creating a parameterized constructor
	Employe(int i,String n,int a)
	{
		Eid=i;
		Ename=n;
		Eage=a;
	}
	void display(){
		System.out.println(Eid+" "+Ename+" "+Eage);
	}
	public static void main(String[]args)
	{
		//creating object and passing the values
		Employe e1=new Employe(03,"mohan",21);
		e1.display();
	}
}