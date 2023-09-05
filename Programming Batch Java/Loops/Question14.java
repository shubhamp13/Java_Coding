
// 14. Write a program to find the value of one number raised to the power of another
import java.util.Scanner;
class Question14{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=ip.nextInt();
		System.out.println("Enter Power:");
		int pow=ip.nextInt();
		int result=1;
		for(int i=1;i<=pow;i++)
		{
			result*=num;
		}	
		System.out.println("The "+num+" Power "+pow+" Is "+result);
	}
}