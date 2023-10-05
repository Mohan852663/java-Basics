//interface implementation
interface Area
{
	final static float pi=3.14f;
	float findarea(float x,float y);
}
class Rectangle implements Area			//class implements interface 
{										//cant extend the interface
	public float findarea(float x,float y){
		return(x*y);		//method for rectange
	}
}
class Circle implements Area
{
	public float findarea(float x, float y){
		return(pi*x*x);		//method for circle
	}
}
class Interface1
{
	public static void main(String[]args)
	{
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		System.out.println("the area of the rectangle is : "+r.findarea(10,20));
		System.out.println("the area is the circle is : "+c.findarea(20,10));
	}
}