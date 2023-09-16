import java.util.Scanner;
class Gcd{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num1=ip.nextInt();
		System.out.println("Enter Second Number");
		int num2=ip.nextInt();
		int gcd=0;
		int min=num1<num2?num1:num2;
		for( int i=1;i<=min;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD Of Two Number Is "+gcd);


	}
}