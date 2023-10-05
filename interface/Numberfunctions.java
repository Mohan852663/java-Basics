package pack1;
class Numberfunctions
{
	public int square(int a)
	{
		return a*a;
	}
	public int cube(int a)
	{
		returnn a*a*a;
	}	
	public int factorial(int a)
	{
		if(a==0)
			return 1;
		else
			return a*factorial(a-1);
	}
}