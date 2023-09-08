//Arraycopy method in java
public class Arraycopy
{
	public static void main(String []args)
	{
		//declaring a source array
		char[] copyfrom={'a','b','c','m','o','h','a','n','z','0'};
		//declaring a destination array
		char[] copyto=new char[5];
		//copying a array using arraycopy
		System.arraycopy(copyfrom,3,copyto,0,5);
		//printing the destination aray
		System.out.println(copyto);
		 
	}
}