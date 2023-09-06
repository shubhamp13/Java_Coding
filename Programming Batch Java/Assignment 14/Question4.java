// 6:Write a program to check whether the number
//  is spy Number
import java.util.Scanner;
class Question4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=s.nextInt();
		int temp=num;
		int sum=0;
		int rem;
		int productOfDigits=1;	
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem;
			productOfDigits*=rem;
			temp/=10;
		}	
		System.out.println(productOfDigits==sum?"Spy Number":"Not Spy Number");
		 
	}
	
}