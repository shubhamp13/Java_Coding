// 3:Write a program to find the summation of
// odd digits of a number

import java.util.Scanner;
class Question1{
	
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int sum=0,rem;
		int temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			if(rem%2!=0)
			{
				sum+=rem;
			}
			temp/=10;
		}
		System.out.println("The Sum Of Odd Digits Of "+num+" Is "+ sum);
	}
	
}