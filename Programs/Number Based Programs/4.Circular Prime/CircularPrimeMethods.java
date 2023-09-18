import java.util.Scanner;
class CircularPrimeMethods
{
	static boolean checkPrime(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				break;
		}
		if(i==n)
			return true;
		else
			return false;
	}
	static int noOfDigits(int n)
	{
		int count=0;
		for(int i=n;i!=0;i/=10)
		{
			++count;
		}
		return count;
	}
	static int rotateNumber(int n)
	{
		int rem=n%10;
		int place=1;
		for(int i=0;i<noOfDigits(n)-1;i++)
		{
			place*=10;
		}
		n/=10;
		int ans=rem*place+n;
		return ans;
	}
	static boolean checkCircularPrime(int n)
	{
		int count=0;
		if(checkPrime(n))
		{
			for(int i=0;i<noOfDigits(n);i++)
			{
				int ans=rotateNumber(n);
				System.out.println(ans);
				if(checkPrime(ans))
					count++;
				else
					break;
				n=ans;
			}
			if(count==noOfDigits(n))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner op=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=op.nextInt();
		if(checkCircularPrime(num))
			System.out.println("Circular Prime");
		else
			System.out.println("Not Circular Prime");

	}
}