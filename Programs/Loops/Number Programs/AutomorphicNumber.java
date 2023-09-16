import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=ip.nextInt();
		
		int digits=0;
		for(int i=num;i!=0;i/=10)
		{
			++digits;
		}
		int pow=1;
		for(int i=0;i<digits;i++)
		{
			pow*=10;
		}
		int square=num*num;
		if(square%pow==num)
			System.out.println(num+" Is Automorphic Number");
		else
			System.out.println(num+" Is Not Automorphic Number");

	}
}