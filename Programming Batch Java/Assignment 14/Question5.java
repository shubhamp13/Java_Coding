// 7:Write a program to check whether the number
//  is Special Number.
import java.util.Scanner;
class Question5
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=input.nextInt();
		int temp=num;
		int sum=0;
		int rem;	
		while(temp!=0)
		{
			rem=temp%10;
			int fact=1;
			int i=1;
			while(i<=rem)
			{
				fact*=i;
				++i;
			}
			// System.out.println(fact);
			sum=sum+fact;
			temp/=10;
		}	
		System.out.println(num==sum?"Special Number":"Not Special Number");
		 
	}
	
}