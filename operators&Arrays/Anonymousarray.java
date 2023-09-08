//passing a anonymous array to a method 
public class Anonymousarray
{
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[]args)
	{
		printArray(new int[]{10,22,33,44,55});
	}
	
}