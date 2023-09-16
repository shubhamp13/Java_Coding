// 4:Write a program to check whether the number
//  is Unique Number.
import java.util.Scanner;
class Question2{

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num;
		int rem,frquency,cnt=0;
		for(int i=0;i<=9;i++)
		{
			temp=num;
			frquency=0;
			while(temp!=0)
			{
				rem=temp%10;
				temp/=10;
				if(rem==i)
				{
					++frquency;
					if(frquency>1)
					{
						cnt=1;
						break;
					}
				}
			}
		}
		if(cnt==0)
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
	}
}