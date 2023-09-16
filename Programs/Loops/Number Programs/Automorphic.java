import java.util.Scanner;
class Automorphic
{
	public static void main(String[] args) 
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Starting Range:");
		int start=x.nextInt();
		System.out.println("Enter Ending Range:");
		int end=x.nextInt();
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=i;j!=0;j/=10 )
			{
				++count;
			}
			int square=i*i;
			int pow=1;
			for(int j=0;j<count;j++)
			{
				pow*=10;
			}
			if(square%pow==i)
			{
				System.out.print(i+" ");
			}
		}
	 

	}	
}