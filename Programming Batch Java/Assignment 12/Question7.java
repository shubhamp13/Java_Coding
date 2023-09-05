import java.util.Scanner;
class Question7{
	public static void main(String[] args) 
	{
		 
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Starting Range");
		int start=ip.nextInt();
		System.out.println("Enter Ending Range");
		int end=ip.nextInt();
		int count=0;
		int rem;
		int rev=0;
		for(int i=start;i<=end;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					++count;
				}
				if(count==2)
				{
					int temp=i;
					while(temp!=0)
					{
						rem=temp%10;
						rev=rev*10+rem;
						temp/=10;
					}
					if(rev==i)
						System.out.println(rev);
				}
			}
		}
	}
}