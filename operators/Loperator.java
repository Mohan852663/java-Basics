// logical operator in java 
/* 	AND &&
	OR ||
	NOT !  		*/
public class Loperator
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=20;
/* 	&&(logical AND)- check all comparison become true. it returns true.
		             when any one of the comparison is false it returns false
||(logical OR)- check one of the comparison become true. it returns true.
				when all the comparison become false it returns false.
!(logical NOT)- it returns the inverse result. when the comparion become true it returns the false.
				when the comparion become false it returns the true.
*/
System.out.println("a<b&&a<c is:"+(a>b&&a>c));
	//10>5&&10>20 - true&&false = false
System.out.println("a<b||a<c is:"+(a>b||a>c));
	//10>5||10>20 - true||false = true 
System.out.println("!a<b||a<c is:"+!(a>b||a>c));
	//!(10>5||10>20) - !(true||false) - !(true) = false //inverse
	}
} 