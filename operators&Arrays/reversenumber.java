//program for reverse a number
public class reversenumber{
	public static void main(String[]args){
		int number=12345,reverse=0; 
		while(number!=0){
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
		System.out.println("reverse of a given number is:"+reverse);
	}
}