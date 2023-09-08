//clone array
public class Clonearray
{
	public static void main(String[]args)
	{
		//actual array
		int arr[]={1,2,3,4,5};
		System.out.println("print the actual array :");
		for(int i:arr)
			System.out.println(i);
		//colne array
		System.out.println("print the colne array :");
		int[] cl_arr=arr.clone();
		for(int i:cl_arr)
			System.out.println(i);
		System.out.println("these both values are equal? :");
		System.out.println(arr==cl_arr);
	}
}