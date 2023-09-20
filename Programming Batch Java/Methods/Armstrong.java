import java.util.Scanner;
class Armstrong
{
	static void CheckArmstrong(int n)
	{
		int count=0,sum=0;
		for(int i=n;i!=0;i/=10)
		{
			++count;
		}
		for(int i=n;i!=0;i/=10)
		{
			int rem=i%10;
			int pow=1;
			for(int j=0;j<count;j++)
			{
				pow*=rem;
			}
			sum+=pow;
		}
		if(sum==n)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		CheckArmstrong(num);	
	}
}