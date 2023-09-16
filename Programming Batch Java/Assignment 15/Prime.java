import java.util.Scanner;
class Prime{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Start:");
		int start=ip.nextInt();
		System.out.println("Enter End:");
		int end=ip.nextInt();
		int flag=0;
		int count=0;
		for(int i=start;i<=end;i++)
		{
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0&&i!=1)
			{

				System.out.print(i+" ");
				++count;
			}
		}	
		System.out.println("\nThe Number Of Prime Numbers Between "+start+" To "+end+" Is "+count);
	}
}