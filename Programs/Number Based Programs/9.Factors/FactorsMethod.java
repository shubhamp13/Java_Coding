import java.util.Scanner;
class FactorsMethod
{
	static void Factors(int n)
	{
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		Factors(num);	
	}
}