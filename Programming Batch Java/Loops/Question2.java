// 2. Write a program to print all natural numbers in reverse

import java.util.Scanner;
class Question2{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range Of Numbers:");
		int num=sc.nextInt();
		int count=num;
		// while(count>=0)
		// {
		// 	System.out.println(count);
		// 	--count;
		// }
		// do
		// {
		// 	System.out.println(count);
		// 	--count;
		// }while(count>=0);
		for(int i=num;i>=0;i--)
		{
			System.out.println(i);
		}
	}
	
}