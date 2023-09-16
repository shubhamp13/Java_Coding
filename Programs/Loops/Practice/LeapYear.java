import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner xc=new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=xc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0)
		{
			System.out.println("LeapYear");
		}	
		else
		{
			System.out.println("Not LeapYear");
		}
	}
}