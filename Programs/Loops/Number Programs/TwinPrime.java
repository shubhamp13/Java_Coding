import java.util.Scanner;
class TwinPrime
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Start:");
		int start=ip.nextInt();
		System.out.println("Enter End:");
		int end=ip.nextInt();
		int prime=2;
		for(int i=start;i<=end;i++)
		{
			int j;
			for( j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
			{
				if(i-prime<=2&&i!=prime)
				{
					System.out.println("("+prime+","+i+")");
				}	
				prime=i;
			}
		}
	}
}