// 7: Write a program to print the sum of all digits of the given number
import java.util.Scanner;
class Question5{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num;
		int rem,sum=0;
		while(temp!=0)
		{
			rem=temp%10;
			sum+=rem;
			temp/=10;
		}	
		System.out.println("The Sum Of The Digits  Of "+num+" Is "+sum);
	}
}