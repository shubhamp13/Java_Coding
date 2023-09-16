// 3:Write a program to check whether the number
//  is Duck Number.
import java.util.Scanner;
class Question1
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num;
		int rem=1;
		while(temp!=0)
		{
			rem=num%10;
			if(rem==0)
				break;
			temp/=10;
		}	
		if(rem==0)
			System.out.println("Duck Number");
		else
			System.out.println("Not Duck Number");
	}
}