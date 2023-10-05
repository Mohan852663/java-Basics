//annotation - override example 
class Animal
{
	void eatSomething()
	{
		System.out.println("eating food");
	}
}
class dog extends Animal
{
	@Override
	void eatSomething()
	{
		System.out.println("eating pedigree");
	}
	
}
public class Override
{
	public static void main(String[]args)
	{
		Animal a=new dog();
		a.eatSomething();
	}
}