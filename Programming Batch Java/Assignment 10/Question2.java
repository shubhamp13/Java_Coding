import java.util.Scanner;
 class Question2{
 	public static void main(String[] args) 
 	{
 		Scanner input=new Scanner(System.in);
 		System.out.println("Enter Day Of The Week:\n1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday");
 		String day=input.next();
 		switch(day)
 		{
 		case "Monday":
 			System.out.println("Basketball");
 			break;

 		case "Tuesday":
 			System.out.println("Tennis");
 			break;

 		case "Wednesday":
 			System.out.println("Basketball");
 			break;

 		case "Thursday":
 			System.out.println("Cricket");
 			break;

 		case "Friday":
 			System.out.println("Tennis");
 			break;

 		case "Saturday":
 			System.out.println("Exercise");
 			break;

 		case "Sunday":
 			System.out.println("Holiday");
 			break;
 		default:
 			System.out.println("Invalid Input");

 		}	
 	}
 }