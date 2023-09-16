import java.util.Scanner;
class LychrelRange
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Starting Range:");
		int start=ip.nextInt();
		System.out.println("Enter Ending Range:");
		int end=ip.nextInt();
		for(int i=start;i<=end;i++)
		{
			long lychrel=i;
			while(true)
			{
				long reverse=0;
				for(long j=lychrel;j!=0;j/=10)
				{
					reverse=reverse*10+(j%10);
				}
				if(reverse==lychrel)
				{
					break;
				}
				lychrel+=reverse;
				if(lychrel<0)
				{
					System.out.print(i+" ");
					break;
				}

			}
		}
	}
}