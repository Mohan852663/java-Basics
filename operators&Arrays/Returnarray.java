//returning a array from the method
public class Returnarray
{
	static int[] get()
	{
		//creating a methd which returns a array
		return new int[]{10,20,30,40,50};
	}
	public static void main(String [] args)
	{ 
		//calling a method which returns a array
		int arr[]=get();
		//printing the values of the array
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}