// 16. write a program to sum of its Digits
import java.util.Scanner;
class Question16{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		int rem;
		// while(temp!=0)
		// {
		// 	rem=temp%10;
		// 	sum+=rem;
		// 	temp/=10;
		// }	
		// System.out.println("The Sum of The Digits Of "+num+" Is "+sum);

		for(int i=num;i!=0;i/=10)
		{
			rem=i%10;
			sum+=rem;
		}
		System.out.println("The Sum of The Digits Of "+num+" Is "+sum);
		
	}
}