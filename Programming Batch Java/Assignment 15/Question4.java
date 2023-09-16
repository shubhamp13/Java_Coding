// 6:Write a program to reverse a given number
import java.util.Scanner;
class Question4{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num;
		int rem,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}	
		System.out.println("The Reverse Of "+num+" Is "+rev);
	}
}