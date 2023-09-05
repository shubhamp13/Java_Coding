// 15. write a program to reverse the given Digits
import java.util.Scanner;
class Question15{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		int rem;
		// while(temp!=0)
		// {
		// 	rem=temp%10;
		// 	rev=rev*10+rem;
		// 	temp/=10;
		// }
		// System.out.println("The Reverse Of "+num+" Is "+rev);

		for(int i=num;i!=0;i/=10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		System.out.println("The Reverse Of "+num+" Is "+rev);
		

	}
}