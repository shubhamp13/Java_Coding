//WAP TO Display Factorial of even number
import java.util.Scanner;
class Question4{
	public static void main(String[] args) 
	{
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int fact=1;
	    for(int i=1;i<=num;i++)
		{
		  fact*=i;
		}

		System.out.println("The Factorial Of Even Number is "+fact);
	 		
	}
}