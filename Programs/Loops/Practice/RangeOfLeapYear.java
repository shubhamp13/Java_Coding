import java.util.Scanner;
class RangeOfLeapYear{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Year:");
		int start=sc.nextInt();
		System.out.println("Enter Ending Year:");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(i%4==0&&i%100!=0||i%400==0)
			{
				System.out.print(i+" ");
				++count;
			}
		}	
		System.out.println("\nThe Number Of Leap Years Between "+start+" To "+end+" Are "+count);
	}
}