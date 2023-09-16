// 8: Write a  program to  find the odd and even digits of a given number
import java.util.Scanner;
class Question6{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=s.nextInt();
		int temp=num;
		int rem=0;
		System.out.println("Even Digits Of "+num+" Are:");
		while(temp!=0)
		{
			rem=temp%10;
			if(rem%2==0)
				System.out.println(rem);
			temp/=10;
		}
		temp=num;
		System.out.println("Odd Digits Of "+num+" Are:");
		while(temp!=0)
		{
			rem=temp%10;
			if(rem%2!=0)
				System.out.println(rem);
			temp/=10;
		}		
	}
}