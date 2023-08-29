import java.util.Scanner;
class Grade{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Marks Obtained:");
		int marks=input.nextInt();
		if(marks>95&&marks<=100)
		{
			System.out.println("A+ Grade");
		}	
		else if (marks>80&&marks<=95) 
		{
			System.out.println("A Grade");
			
		}
		else if (marks>65&&marks<=80) 
		{
			System.out.println("B Grade");
			
		}
		else if (marks>50&&marks<=65) 
		{
			System.out.println("C Grade");

		}
		else if (marks>=35&&marks<=50) 
		{
			System.out.println("D Grade");

		}
		else if (marks>=0&&marks<35) 
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Enter Correct Marks");
		}
	}
	
}