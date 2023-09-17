import java.util.Scanner;
class ArmstrongMethods
{
	static int noOfDigits(int n)
	{
		int count=0;
		for(int i=n;i!=0;i/=10)
		{
			++count;
		}
		return count;
	}
	static int power(int rem,int num)
	{
		int pow=1;
		for(int i=0;i<noOfDigits(num);i++)
		{
			pow*=rem;
		}
		return pow;
	}
	static boolean checkArmstrong(int n)
	{
		int sum=0;
		for(int i=n;i!=0;i/=10)
		{
			int rem=i%10;
			sum+=power(rem,n);
		}
		if(sum==n)
			return true;
		else
			return false;

	}
	public static void main(String[] args) 
	{
		Scanner ic=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=ic.nextInt();
		if(checkArmstrong(num))
		{
			System.out.println(num+" Is Armstrong Number");
		}
		
	}
}