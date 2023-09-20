import java.util.Scanner;
class HappyNumberMethod
{
	static int digitAddition(int n)
	{
		int sum=0;
		for(int i=n;i!=0;i/=10)
		{
			int rem=i%10;
			sum+=rem*rem;
		}
		return sum;
	}
	static boolean checkHappy(int n)
	{
		int res=n;
		while(res!=1)
		{
			res=digitAddition(res);
		}
		if(res==1)
			return true;
		else
			return false;

	}

	public static void main(String[] args) 
	{
		int num=11;
		if(checkHappy(num))
			System.out.println("Happy Number");
		else
			System.out.println("Not Happy Number");


		
		// for(int i=1;i<=100;i++)
		// {
		// 	if(checkHappy(i))
		// 		System.out.print(i+"  ");
		// }
		
	}
}