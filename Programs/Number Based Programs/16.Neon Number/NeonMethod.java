import java.util.Scanner;
class NeonMethod
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
	static boolean checkNeon(int a)
	{
		int square=a*a;
		if(sumOfDigits(square)==a)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num=t.nextInt();
		if(checkNeon(num))
			System.out.println("Neon Number");
		else
			System.out.println("Not Neon Number");	

	}
}