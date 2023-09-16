import java.util.Scanner;
class RangeOfPrimeNO{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Starting Point:");
		int start=ip.nextInt();
		System.out.println("Enter Ending Point:");
		int end=ip.nextInt();
		for(int i=start;i<=end;i++)
		{
			int j;
			for( j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j>i/2&&i!=1)
				System.out.print(i+" ");
		}	
	}
}