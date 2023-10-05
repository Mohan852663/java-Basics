//static method in interface exapmle
interface drawable
{
	void draw();
	//using static method 
	static int cube(int x){
		return(x*x*x);
	}
}
class rectangle implements drawable
{
	public void draw(){
		System.out.println("the drawing rectangle");
	}
}
class Interface3
{
	public static void main(String[]args)
	{
		drawable d=new rectangle();
		d.draw();
		System.out.println(drawable.cube(3)); 
	}
}