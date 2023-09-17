import java.util.Scanner;
class CircularPrimeRange
{
	public static void main(String[] args) 
	{
		Scanner X=new Scanner(System.in);
		System.out.println("Enter Start:");
		int start=X.nextInt();
		System.out.println("Enter End:");
		int end=X.nextInt();
		for(int i=start;i<=end;i++)
		{
			int checkPrime,count=0,flag=0;
			for(checkPrime=2;checkPrime<i;checkPrime++)
			{
				if(i%checkPrime==0)
					break;
			}
			if(checkPrime==i)
			{
				int temp=i;
				for(int j=temp;j!=0;j/=10)
				{
					++count;
				}
				for(int k=0;k<count;k++)
				{
					int rem=temp%10;
					temp/=10;
					int place=1;
					for(int p=0;p<count-1;p++)
					{
						place*=10;
					}
					int ans=rem*place+temp;
					int a;
					for( a=2;a<ans;a++)
					{
						if(ans%a==0)
							break;
					}
					if(ans==a)
						++flag;
					temp=ans;
				}
				if(flag==count)
					System.out.println(i+"  ");
			}
		}
	}	
}