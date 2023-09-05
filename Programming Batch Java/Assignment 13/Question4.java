
// 5:Write a program to find sum of n natural
// numbers

import java.util.Scanner;
class Question4{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter Nth Number To Calculate Its Sum");
		int num=s.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("The Sum Of "+num+" Th Natural Number Is "+sum);

	}

}