import java.util.Scanner;
class RangeOfPerfectNo
{
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting Point:");
		int start=s.nextInt();
		System.out.println("Enter Ending Point:");
		int end=s.nextInt();
		int count=0;
		int sum;
		// int num=0;
		for(int i=start;i<=end;i++)
		{
			sum=0;
			// num=i;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum==i)
			{
				System.out.print(i+" ");
				++count;
			}
		}
		System.out.println("The Perfect Numbers Between "+start+" And "+end+" Is "+count);
	}
}