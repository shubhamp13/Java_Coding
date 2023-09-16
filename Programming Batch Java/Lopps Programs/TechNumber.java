import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=ip.nextInt();
		int temp=num;
		int count=0;
		while(temp!=0)
		{
			temp/=10;
			++count;
		}	
		temp=num;
		int tech=0;
		if(count%2==0)
		{
			int split=1;
			for(int i=0;i<count/2;i++)
			{
				split*=10;
			}
			 
				int digitOne=temp%split;
				int digitTwo=temp/split;
				tech=digitOne+digitTwo;
				0
			if(tech*tech==num)
				System.out.println("Tech Number");
			else
				System.out.println("Not Tech Number");
		}
		else
		{
			System.out.println("Not Tech Number");
		}

	}
}