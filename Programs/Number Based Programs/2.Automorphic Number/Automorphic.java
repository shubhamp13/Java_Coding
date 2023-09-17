import java.util.Scanner;
class Automorphic
{
	public static void main(String[] args) 
	{
		Scanner xp=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=xp.nextInt();
		int square=num*num;
		int count=0;
		for(int i=num;i!=0;i/=10)
		{
			++count;
		}	
		int denominator=1;
		for(int i=0;i<count;i++)
		{
			denominator*=10;
		}
		int extractDigits=square%denominator;
		if(extractDigits==num)
		{
			System.out.println(num+" Is Automorphic Number");
		}
		else
		{
			System.out.println(num+" Is Not  Automorphic Number");

		}
	}
}