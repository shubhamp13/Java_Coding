import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner Z=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num=Z.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact*=i;
		}	
		System.out.println("The Factorial is "+fact);
	}
}