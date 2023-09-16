import java.util.Scanner;
class Amicable{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		int sum1=0,sum2=0;
		int max=num1>num2?num1:num2;
		for(int i=1;i<=max/2;i++)
		{
			if(num1%i==0)
			{
				sum1+=i;
			}
			if(num2%i==0)
			{
				sum2+=i;
			}
		}
		if(sum1==num2&&sum2==num1)
		{
			System.out.println("Amicable Number");
		}
		else
		{
			System.out.println("Not Amicable Number");
		}
	}
}