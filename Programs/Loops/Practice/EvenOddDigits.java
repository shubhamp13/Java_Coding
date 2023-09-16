import java.util.Scanner;
class EvenOddDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int temp=num;
		int evenDigits=0,oddDigits=0;
		while(temp!=0)
		{
			int rem=temp%10;
			if(rem%2==0)
				++evenDigits;
			else
				++oddDigits;
			temp/=10;

		}
		System.out.println("The "+num+" Has "+evenDigits+" Even Digits And "+oddDigits+" Odd Digits In Given Number");
	}
}