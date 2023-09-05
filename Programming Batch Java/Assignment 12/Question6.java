//WAP To Reverse The Given Number
import java.util.Scanner;
class Question6{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=input.nextInt();
		int rev=0;
		int rem;
		int temp=num;
		while(temp!=0)
		{
			rem=temp%10;//120%10=0//2//1%10=10
			rev=rev*10+rem;//0////2//2*10+1=21
			temp=temp/10;//12//1//
		}
		System.out.println("The Reverse Number Of "+num+" Is "+rev);	
		if(rev==num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	

	}
}