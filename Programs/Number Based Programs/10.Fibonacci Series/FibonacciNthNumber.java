import java.util.Scanner;
class FibonacciNthNumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n th number To Print:");
		int n=ip.nextInt();
		int count=0;
		int t1=0,t2=1,t3;
		for(;;)//infinite loop	
		{
			t3=t1+t2;
			if(count==n)
			{
				System.out.print("The "+n+" Th Fibonacci Number Is "+t1);
				break;
			}
			t1=t2;
			t2=t3;
			++count;
		}
	}
}