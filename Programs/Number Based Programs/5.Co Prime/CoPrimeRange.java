import java.util.Scanner;
class CoPrimeRange
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Start:");
		int start=scan.nextInt();
		System.out.println("Enter End:");
		int end=scan.nextInt();
		for(int i=start;i<=end;i++)
		{
			int min=i;
			int hcf=1;
			for(int j=1;j<i;j++)
			{
				if(i%j==0&&(i+1)%j==0)
				{
					hcf=j;
				}

			}
			if(hcf==1)
				System.out.println("("+i+","+(i+1)+")");
		}

	}	
}