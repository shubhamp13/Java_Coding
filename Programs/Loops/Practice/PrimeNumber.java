import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner x=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num=x.nextInt();
		int i=0;
		for( i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		if(i>num/2&&num!=1)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	 
	}
}