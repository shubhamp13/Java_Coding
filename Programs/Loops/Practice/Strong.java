import java.util.Scanner;
class StrongNumber{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num;
		int fact=1;
		int rem;
		int sum=0;
		while(temp!=0)
		{
			rem=temp%10;
			fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;
			}
			sum+=fact;
			temp/=10;
		}	
		if(sum==num)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");
	}
}