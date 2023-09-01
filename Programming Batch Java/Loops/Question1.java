
// 1. Write a program to print all natural numbers from 1 to n

import java.util.Scanner;
class Question1{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Range Up to Which You Want To Print Natural Numbers");
		int num=ip.nextInt();
		int count=1;
		// while(count<=num)
		// {
		// 	System.out.println(count);
		// 	++count;
		// }
		// for(int i=0;i<=num;i++)
		// {
		// 	System.out.println(i);
		// }
		do
		{
			System.out.println(count);
			++count;

		}while(count<=num);
	}
}
