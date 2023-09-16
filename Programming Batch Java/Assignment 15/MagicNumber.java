import java.util.Scanner;
class MagicNumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=ip.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0|| sum>9)
		{
			if(temp==0)
			{
				temp=sum;
				sum=0;
			}
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		if(sum==1)
			System.out.println("Magic Number");
		else
			System.out.println("Not Magic Number");
	}	
}