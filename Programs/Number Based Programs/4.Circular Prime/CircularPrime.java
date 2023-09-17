import java.util.Scanner;
class CircularPrime
{
	public static void main(String[] args) 
	{
		Scanner p=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=p.nextInt();
		int checkPrime;
		for( checkPrime=2;checkPrime<num;checkPrime++)
		{
			if(num%checkPrime==0)
				break;
		}
		int count=0,flag=0;
		if(num==checkPrime)
		{
			++flag;
			int temp=num;
			
			for(int i=num;i!=0;i/=10)
			{
				++count;
			}
			for(int i=0;i<count-1;i++)
			{
				int rem=temp%10;
				temp/=10;
				int place=1;
				for(int j=0;j<count-1;j++)
				{
					place*=10;
				}
				int ans=rem*place+temp;
				int prime=2;
				for( prime=2;prime<ans;prime++)
				{
					if(ans%prime==0)
						break;
				}
				if(ans==prime)
					++flag;
				else
					break;
				temp=ans;
				System.out.println(ans);
			}
			
			if(flag==count)
				System.out.println(num+" Is Circular Prime Number");
			else
				System.out.println(num+" Is Not Circular Prime Number");
		}
		else
			System.out.println(num+" Is Not Prime Only");
		
	}
}