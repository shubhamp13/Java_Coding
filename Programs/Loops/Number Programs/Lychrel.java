import java.util.Scanner;
class Lychrel
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		long temp=num;
		while(true)
		{
			long reverse=0;
			for(long i=temp;i!=0;i/=10)
			{
				reverse=reverse*10+(i%10);
			}		 
			if(reverse==temp)
			{
				System.out.println(num+" Is Not A Lychrel Number");
				break;
			}
			temp+=reverse;
			if(temp<0)
			{
				System.out.println(num+" Is Lychrel Number");
				break;
			}
		}
	}
}