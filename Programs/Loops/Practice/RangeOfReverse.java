import java.util.Scanner;
class RangeOfReverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Starting Number:");
		int start=sc.nextInt();
		System.out.println("Enter The Ending Number:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			int rem=0;
			int temp=i;
			int reverse=0;
			while(temp!=0)
			{
				rem=temp%10;
				reverse=reverse*10+rem;
				temp/=10;
			}
			System.out.println(reverse+" ");
		}


	}
}