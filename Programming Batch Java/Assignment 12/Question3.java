//WAP Find The Factors of given number
import java.util.Scanner;
class Question3{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}	
	}
}