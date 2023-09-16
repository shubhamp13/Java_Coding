import java.util.Scanner;
class AutomorphicMethod
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
		System.out.println("Enter Number:");
		int num=input.nextInt();
		if(checkAutomorphic(num))
			System.out.println(num+" Is Automorphic Number");
		else
			System.out.println(num+" Is Not Automorphic Number");


	}
}