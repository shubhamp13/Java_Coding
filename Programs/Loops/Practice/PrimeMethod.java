import java.util.Scanner;
class PrimeMethod{
	
	 static int checkPrime(int n)
	{
		int i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		System.out.println(PrimeMethod.checkPrime(num)==0?"Prime Number":"Not Prime Number");
	}
}