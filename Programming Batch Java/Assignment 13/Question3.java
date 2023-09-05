// 4:Write a program to print even numbers in the
// given range.
import java.util.Scanner;
class Question3{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Staring Range:");
		int start=sc.nextInt();
		System.out.println("Enter Ending Range:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}

}