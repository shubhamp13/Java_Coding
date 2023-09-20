import java.util.Scanner;
class FibonacciRange
{
	public static void main(String[] args) 
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Start:");
		int start=x.nextInt();
		System.out.println("Enter End:");
		int end=x.nextInt();
		int t1=0,t2=1,t3;
		for(;;)
		{
			t3=t1+t2;
			if(t1>=start&&t1<end)
				System.out.print(t1+" ");
			if(t1>end)
				break;
			t1=t2;
			t2=t3;
		}

	}
}