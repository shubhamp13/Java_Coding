import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int count=0,sum=0;
		for(int i=num;i!=0;i/=10 )
		{
			++count;
		}	
		for(int i=num;i!=0;i/=10)
		{
			int rem=i%10;
			int pow=1;
			for(int j=0;j<count;j++)
			{
				pow*=rem;
			}
			sum+=pow;
		}
		if(sum==num)
			System.out.println("The "+num+" Is Armstrong Number");
		else
			System.out.println("The "+num+" Is Not Armstrong Number");

	}
}