import java.util.Scanner;
class CircularPrime
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		boolean flag=false,flag1=false;
		int num=ip.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Not Only Prime Number");
		}
		else
		{
			for(int k=1;k<=100	;k++)
			{
				int count=0;
				for(int i=k;i!=0;i/=10)
				{
					++count;
				}
				for(int i=0;i<count;i++)
				{
					int rem=k%10;
					int pow=1;
					for(int j=0;j<count-1;j++)
					{
						pow*=10;
					}
				 	flag1=false;
					int sum=rem*pow+(k/10);
					for(int j=2;j<sum;j++)
					{
						if(sum%j==0)
						{
							flag1=true;
							break;
						}

				}
				k=sum;

			}
		}
			
			if(flag1==false)
				System.out.println("Circular Prime");
			else
			System.out.println("Not A Circular Prime Number");	

		}


	}
}