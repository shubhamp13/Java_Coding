import java.util.Scanner;
class GCD
{
	public static void main(String[] args) 
	{
		Scanner  xc=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num1=xc.nextInt();
		System.out.println("Enter Number:");	
		int num2=xc.nextInt();
		int min=num1<num2?num1:num2;
		int gcd=1;
		for(int i=1;i<=min;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("The GCD of "+num1+" And "+num2+" Is "+gcd);

	}
}