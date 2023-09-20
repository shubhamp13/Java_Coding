import java.util.Scanner;
class MulDigitsMethod
{
	static int digit(int a)
	{
		int mul=1;
		for(int i=a;i!=0;i/=10)
		{
			int rem=i%10;
			mul*=rem;
		}
		return mul;
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		System.out.println("Multiplication Of Digits:"+digit(num));

	}	
}