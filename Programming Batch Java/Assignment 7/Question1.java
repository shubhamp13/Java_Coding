import java.util.Scanner;
class Question1{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();

		if(num%2==0)
		{
			System.out.println("Its Even Number");
			int lastDigit=num%10;
			if(lastDigit%2==0)
			{
				System.out.println("Last Digit Also Even");
			}
			else
			{
				System.out.println("Last Digit Is Odd");
			}
		}
		else
		{
			System.out.println("Its Odd");
			int digit=num/10;//
			int secondLastDigit=digit%10;
			if(secondLastDigit%2==0)
			{
				System.out.println("Second Last Digit Is Even");
			}
			else
			{
				System.out.println("Second Last Digit Is Odd");
			}
		}	
	}
	
}