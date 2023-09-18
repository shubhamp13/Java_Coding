import java.util.Scanner;
class FactorialMethod
{
	static int factorial(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;	
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		System.out.println("The Factorial of Number Is "+factorial(num));
	}
}