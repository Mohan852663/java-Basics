//methods using in the autoboxing unboxing 
class boxingmethods
{
	public static void main(String[]args)
	{
		int a=10;
		int b=20; 	
		System.out.println("convert the primituve types to String() using toString() method : ");
		String s1=Integer.toString(a);
		String s2=Integer.toString(b);
		System.out.println("s1 + s2 is : "+(s1+s2)); // + used for string concatination
		
		System.out.println("coverting primitive types into wrapper class objects using constructors");
		Integer i=new Integer(a);	//Autoboxing
		Integer j=new Integer(b);	//Autoboxing
		System.out.println("i + j is : "+(i+j));
		
		System.out.println("converting wrapper class object to primitive datatype");
		int x=i.intValue();
		int y=j.intValue();
		System.out.println("x * Y is : "+(x*y));
		
		System.out.println("converting String into wrapper class object using valueOf() ");
		Integer m=Integer.valueOf("123");
		Integer n=Integer.valueOf("456");
		System.out.println("m + N os : "+(m+n));
		
		System.out.println("conver string into primitive type using parse() method");
		int p=Integer.parseInt("1234");
		int q=Integer.parseInt("5678");
		System.out.println("p + q is : "+(p+q));
	} 
}