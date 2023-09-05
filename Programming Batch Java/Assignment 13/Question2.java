// 4:Write a program to print numbers between
// m and n.
// (m and n  must be user input) 
import java.util.Scanner;
class Question2{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Staring Range:");
		int start=input.nextInt();
		System.out.println("Enter Ending Range:");
		int end=input.nextInt();
		for(int i=start;i<=end;i++)
		{
			System.out.print(i+" ");
		}
	}

}