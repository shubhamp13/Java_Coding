// 5:Write  program to find the LCM of two number
import java.util.Scanner;
class Question3{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=ip.nextInt();
		System.out.println("Enter Second Number:");
		int num2=ip.nextInt();
		int max=num1>num2?num1:num2;
		int gcd=0;
		for(int i=1;i<=max;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				gcd=i;
			}
		}
		int lcm=(num1*num2)/gcd;
		System.out.println("The Lcm Of Two Number Is "+lcm);
	}
}