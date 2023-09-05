// 13. Write a program to find the factorial value of any number

import java.util.Scanner;
class Question13{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Print Its Factorial");
		int num=sc.nextInt();
		int fact=1;
		int count=1;
		// while(count<=num)
		// {
		// 	fact*=count;
		// 	++count;
		// }
		// System.out.println("The Factorial Of "+num+" Is "+fact);

		// do
		// {
		// 	fact*=count;
		// 	++count;
		// }while(count<=num);
		// System.out.println("The Factorial Of "+num+" Is "+fact);
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("The Factorial Of "+num+" Is "+fact);
		

	}
}
