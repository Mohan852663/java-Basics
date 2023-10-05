//with lambda expression in anonymous class
class Lambdawith3
{
	public static void main(String[]args)
	{
		Thread t=new Thread( ()-> {  //lambda expression executed
			for(int i=0;i<10;i++)
				System.out.println("child thread");
		});
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("main thread");
	}
}  