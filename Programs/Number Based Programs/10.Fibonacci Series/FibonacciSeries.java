import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Terms:");
		int range=ip.nextInt();
		int t1=0,t2=1,t3;
		for(int i=0;i<range;i++)
		{
				t3=t1+t2;
				System.out.print(t1+"  ");
				t1=t2;
				t2=t3;
		}	
	}
}