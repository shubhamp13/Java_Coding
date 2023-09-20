import java.util.Scanner;
class FloydTriangle
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int n=ip.nextInt();
		int k=1;
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%02d ",k++);
			}
			System.out.println();
		}	
	}
}