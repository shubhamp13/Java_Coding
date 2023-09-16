import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=in.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}		
		System.out.println("The Factorial Of "+num+" Is "+fact);
	}	
}