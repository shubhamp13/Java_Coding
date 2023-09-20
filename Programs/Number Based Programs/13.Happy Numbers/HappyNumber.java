import java.util.Scanner;
class HappyNumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num;
		for(;;)
		{
			int sum=0;

			for(int i=temp;i!=0;i/=10)
			{
				int rem=i%10;
				sum+=rem*rem;
			}
			if(sum==1)
			{
				System.out.println("Its The Happy Number");
				break;
			}
			else if(sum>1&&sum<10)
			{
				System.out.println("Its Not The Happy Number");
				break;
			}
			else
			{
				temp=sum;
			}
		}	
	}
}