import java.util.Scanner;
class HarshadMethod
{
	static int sumOfDigits(int a)
	{
		int sum=0;
		for(int i=a;i!=0;i/=10)
		{
			int rem=i%10;
			sum+=rem;
		}
		return sum;
	}	
	static boolean checkNiven(int a)
	{
		if(a%sumOfDigits(a)==0)
			return true;
		else
			return false;
	}
	public static void main(String [] args)
	{
		Scanner w=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=w.nextInt();
		if(checkNiven(num))
			System.out.println("Niven Number");
		else
			System.out.println("Not Niven Number");

	}
}