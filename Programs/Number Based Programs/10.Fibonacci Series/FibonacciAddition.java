import java.util.Scanner;
class FibonacciAddition
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int t1=0,t2=1;t3,count=0,sum=0;
		for(;;)
		{
			t3=t1+t2;
			sum+=t1;
			t1=t2;
			t2=t3;
			++count;
			if(count==num)
				break;
		}	
		System.out.println("The Addition Of "+num+" th Fibonacci Numbers Are:"+sum)
	}
		
}