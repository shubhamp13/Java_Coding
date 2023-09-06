// 4:Write a program to check whether the number
//  is Buzz Number.

import java.util.Scanner;
class Question2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		System.out.println((num%10==7||num%7==0)?"Buzz Number":"Not Buzz Number");
	}
	
}