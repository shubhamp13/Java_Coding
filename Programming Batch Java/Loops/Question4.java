// 4. Write a program to print reverse tables
import java.util.Scanner;
class Question4{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number To Print Its Table In Reverse");
		int num=s.nextInt();
		int count=10;
		while(count>=1)
		{
			System.out.println(num+" * "+count+" = "+(num*count));
			--count;
		}
		System.out.println();
		int temp=10;
		do
		{
			System.out.println(num+" * "+temp+" = "+(num*temp)) ;
			--temp;

		}while(temp>=1);
		System.out.println();

		for(int i=10;i>=1;i--)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	
}