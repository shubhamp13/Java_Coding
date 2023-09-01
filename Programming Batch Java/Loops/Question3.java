// 3. Write a program to print tables
import java.util.Scanner;

class Question3{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in) ;
		System.out.println("Enter Number To Print Its multiplication Table");
		int num=input.nextInt();
		int count=1;
		// while(count<=10)
		// {
		// 	System.out.println(num +" * "+count+" = "+(num*count));
		// 	++count;
		// }
		// do
		// {
		// 	System.out.println(num+" * "+count+" = "+(num*count));
		// 	++count;
		// }while(count<=10);
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(i*num));
		}
	}
}