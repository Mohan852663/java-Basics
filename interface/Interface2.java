//interface  implements keyword example
interface cricket
{
	int player1=10;
	int player2=5;
}
class game implements cricket
{
	void print(){
		System.out.println("no of players in 1 is : "+player1);
		System.out.println("no of players in 2 is : "+player2);
	}
}
public class Interface2
{
	public static void main(String[]args)
	{
		game g=new game();
		g.print();
	}
}