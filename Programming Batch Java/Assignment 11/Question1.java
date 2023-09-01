import java.util.Scanner;
class Question1{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter The Year:");
		year=sc.nextInt();
		System.out.println("Enter Your Choice\n1.Leap Year\n2.Digits Of Year\n3.Even Or Odd");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			if((year%4==0&&year%100!=0)||year%400==0)
			{
				System.out.println("The Given Year Is"+year+" Leap Year");
			}
			else
			{
				System.out.println("The Given Year "+year+" Is Not Leap Year");
			}
			break;

		case 2:
				int temp=year;
				int count=0;
				int rev=0;
				while(temp!=0)
				{
					int r=temp%10;
					temp=temp/10;
					rev=rev*10+r;
					count++;
				}
				System.out.println("The Number Of Digits Are: "+count);
				System.out.println("Reverse: "+rev);
				break;




		case 3:
			if(year%2==0)
			{
				System.out.println("Even Year");
			}
			else
			{
				System.out.println("Odd Year");
			}
			break;
			
		}	
	}
}