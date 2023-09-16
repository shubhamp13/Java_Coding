import java.util.Scanner;
class PrimeFactors
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				int flag=0;
				for(int j=2;j<=i/2;j++)
				{
					// if(i%j==0)
					{
						flag=1;
					}
				}
				if(flag==0&&i!=1)
					System.out.print(i+" ");
			}
		}		
	}	
}