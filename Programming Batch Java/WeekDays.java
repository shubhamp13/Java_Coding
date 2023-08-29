import java.util.Scanner;
class WeekDays{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Character Input For Week Days:");
		char week=input.next().charAt(0);
		if(week=='M')
		{
			System.out.println("Monday");
		}	
		else if(week=='T')
		{
			System.out.println("Tueseday");
		}
		else if (week=='W') 
		{
			System.out.println("Wednesday");
			
		}
		else if (week=='H') 
		{
			System.out.println("Thureseday");
			
		}
		else if (week=='F') 
		{	
			System.out.println("Friday");
		}
		else if (week=='S') 
		{
			System.out.println("Saturday");

		}
		else if (week=='O') 
		{
			System.out.println("Sunday");

		}
		else
		{
			System.out.println("Enter Correct Character");
		}
	}
}