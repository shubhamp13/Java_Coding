import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=x.nextInt();
		int temp=num;
		int digits=0;
		int rem,sum=0,pow=1;
		while(temp!=0)
		{
			temp/=10;
			++digits;
		}	
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			pow=1;
			for(int i=0;i<digits;i++)
			{
				pow=pow*rem;
			}
			sum+=pow;
			temp/=10;
		}
		if(sum==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
	
}