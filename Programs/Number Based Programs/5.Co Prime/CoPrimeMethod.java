import java.util.Scanner;
class CoPrimeMethod
{
	static boolean checkCoPrime(int a,int b)
	{
		int min=a<b?a:b;
		int hcf=1;
		for(int i=2;i<min;i++)
		{
			if(a%i==0&&b%i==0)
			{
				hcf=i;
				 
			}
		}
		if(hcf==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num1=input.nextInt();
		System.out.println("Enter Number:");
		int num2=input.nextInt();
		if(checkCoPrime(num1,num2))
		{
			System.out.println("Co Prime");
		}		
		else
		{
			System.out.println("Not Co Prime");
		}
	}	
}