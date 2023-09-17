import java.util.Scanner;
class AutomorphicRangeMethod
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
	static boolean checkAutomorphic(int n)
	{
		int square=n*n;
		int denominator=1;
		for(int i=0;i<noOfDigits(n);i++)
		{
			denominator*=10;
		}
		int extract=square%denominator;
		if(extract==n)
			return true;
		else
			return false;

	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);	
		System.out.println("Enter Start:");
		int start=input.nextInt();
		System.out.println("Enter end:");
		int end=input.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(checkAutomorphic(i))
				System.out.print(i+"  ");
		}
		
	 


	}
}