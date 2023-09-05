
// 6:Write a program to find GCD of two
// numbers
import java.util.Scanner;
class Question5{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		int max=num1>num2?num1:num2;
		int gcd=0;

		for(int i=1;i<=max;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				gcd =i;
			}
		}
		System.out.println("GCD Of Two Number Is "+gcd);

	}

}