//unary operator example program

/* unary operator -- ++
	a++ > a=a+1
	++a > a=a+1
	a-- > a=a-1
	--a > a=a-1
*/
public class unaryoperator{
public static void main(String args[]){
int X=10;
System.out.println(X++);	//10 (10+1=11)
System.out.println(++X);	//(11+1) 12
System.out.println(X--);	//12 (12-1)
System.out.println(--X);	//(11-1) 10
}
}