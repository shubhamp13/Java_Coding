// 7: Write a java program to check whether  the given number is  neon number.
import java.util.Scanner;
class Question6{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=input.nextInt();
		int square=(num*num);
		int rem,sum=0;
		while(square!=0)
		{
			rem=square%10;
			sum+=rem;
			square/=10;
		}	
		System.out.println(sum==num?"Neon Number":"Not Neon Number");
	}
}