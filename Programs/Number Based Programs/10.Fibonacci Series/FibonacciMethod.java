import java.util.Scanner;
class FibonacciMethod
{
	static void fibonacci(int n)
	{
		int t1=0,t2=1,t3;
		for(int i=0;i<n;i++)
		{
			System.out.print(t1+" ");
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
	}
	static int fibonacciNumber(int n)
	{
		int t1=0,t2=1,t3;
		int count=0;
		for(;;)
		{
			t3=t1+t2;
			if(count==n)
			{
				return t1;
			}
			t1=t2;
			t2=t3;
			++count;
		}
	}
	static boolean checkFibonacci(int n)
	{
		int t1=0,t2=1,t3;
		for(;;)
		{
			t3=t1+t2;
			if(n==t1)
				return true;
			else if (t1>n) 
			{
				return false;	
			}
			t1=t2;
			t2=t3;
		}

	}
	static void fibonacciRange(int a,int b)
	{
		int t1=0,t2=1,t3;
		for(;;)
		{
			t3=t1+t2;
			if(t1>=a&&t1<=b)
				System.out.print(t1+" ");
			if(t1>b)
				break;
			t1=t2;
			t2=t3;
		}
	}

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
	
		while(true)
		{
			System.out.print("\n*********************************************************************************");
				System.out.println("\nEnter Your Choice:\n1.Print Fibonacci Numbers Upto n terms.\n2.Display N th Fibonacci Number.\n3.Check The Number Is Fibonacci Number Or Not.\n4.Print Fibonacci Number Between Range.\n5.Exit\n*********************************************************************************");
				int ch=ip.nextInt();
			// System.out.println("*********************************************************************************");

			switch(ch)
			{
				case 1:System.out.println("Enter How Many Numbers You Want to print");
					int count=ip.nextInt();
					fibonacci(count);
					break;

				case 2: System.out.println("Enetr N th Number To Display Fibonacci Number:");
					int n=ip.nextInt();
					System.out.println("The N th Fibonacci number Is "+fibonacciNumber(n));
					break;

				case 3:System.out.println("Enter number to check Number is Fibonacci Or Not");
					int num=ip.nextInt();
					if(checkFibonacci(num))
						System.out.println(num+" Is Fibonacci Number");
					else
						System.out.println(num+" Is Not Fibonacci Number");
					break;
				case 4:System.out.println("Enter Start and End Range:");
					int start=ip.nextInt();
					int end=ip.nextInt();
					fibonacciRange(start,end);
					break;
				case 5: System.exit(0);
						break;

				default: System.out.println("Enter Correct Choice:");
			}
		}


			
	}
}
