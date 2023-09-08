//passing a array as a parameter
//finding the minimum 
class passingArray{
	static void find_min(int arr[]) //passing a arr parameter
	{
		int min=arr[0]; //consider the first element 0 is minimum ,min=33
		for(int i=1;i<arr.length;i++)
		{                        //i<arr.length --> 1
			if(min>arr[i])     // 33>[1]-- 33>3 true
				min=arr[i];
		}
		System.out.println(min);
	}
	public static void main(String[]args){
		int a[]={33,3,4,5};
		find_min(a); 	//passing array to method
	}
}