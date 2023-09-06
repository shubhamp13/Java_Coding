// 5:Write a program to check whether the number
//  is Magic Number.
import java.util.Scanner;
class Question3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int rem;	
		while(temp!=0||sum>9)
		{
			if(temp==0)
			{
				temp=sum;
				sum=0;
			}
			rem=temp%10;
			sum=sum+rem;
			temp/=10;
		}	
		System.out.println(sum==1?"Magic Number":"Not Magic Number");
		 
	}
	
}