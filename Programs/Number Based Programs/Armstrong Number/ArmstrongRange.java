import java.util.Scanner;
class ArmstrongRange
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Start:");
		int start=ip.nextInt();
		System.out.println("Enter End:");
		int end=ip.nextInt();
		for(int i=start;i<=end;i++)
		{
			int count=0,sum=0;
			for(int j=i;j!=0;j/=10)
			{
				++count;
			}
			for(int j=i;j!=0;j/=10)
			{
				int rem=j%10;
				int pow=1;
				for(int k=0;k<count;k++)
				{
					pow*=rem;
				}
				sum+=pow;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}