import java.util.Scanner;
class FibonacciNumber
{
	public static void main(String[] args) 
	{
		Scanner Z=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=Z.nextInt();
		int t1=0,t2=1,t3;
		for(;;)
		{
			t3=t1+t2;
			if(num==t1)
			{
				System.out.println("The "+num+" Is Fibonacci Series Number");
				break;
			}
			else if(t1>num)
			{
				System.out.println("The "+num+" Is Not Fibonacci Series Number:");
				break;
			}
			t1=t2;
			t2=t3;

		}	
	}
}