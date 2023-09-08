//if-else if ladder statement
// program for marks grade fail , d , c , b , a , a+
public class IFELSEIF{
	public static void main(String []args){
		int mark=65;
		if(mark<50){
			System.out.println("fail");
		}
		else if(mark>=50 && mark<60){
			System.out.println("d grade");
		}
		else if(mark>=60 && mark<70){
			System.out.println("c grade");
		}
		else if(mark>=70 && mark<80){
			System.out.println("b grade");
		}
		else if(mark>=80 && mark<90){
			System.out.println("a grade");
		}
		else if(mark>=90 && mark<100){
			System.out.println("a+ grade");
		}
		else{
			System.out.println("Invalid");
		}
		
	} 
}