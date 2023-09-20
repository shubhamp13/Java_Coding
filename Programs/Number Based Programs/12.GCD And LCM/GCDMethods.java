import java.util.Scanner;
class GCDMethods
{
	static int gcd(int a,int b)
	{
		int hcf=1;
		int min=a<b?a:b;
		for(int i=1;i<=min;i++)
		{
			if(a%i==0&&b%i==0)
			{
				hcf=i;
			}
		}
		return hcf;
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num1=ip.nextInt();
		System.out.println("Enter Number:");
		int num2=ip.nextInt();	
		System.out.println("The GCD Of "+num1+" And "+num2+" Is "+gcd(num1,num2));
	}
}