import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=num;i!=0;i/=10)
		{
			++count;
		}
		int sum=0;	
		for(int i=num;i!=0;i/=10)
		{
			int rem=i%10;
			int pow=1;
			for(int j=0;j<count;j++)
			{
				pow=pow*rem;
			}
			sum+=pow;
		}
		if(sum==num)
		{
			System.out.println(num+" Is Armstrong Number");
		}
		else
		{
			System.out.println(num+" Is Not Armstrong Number");
		}
	}
}