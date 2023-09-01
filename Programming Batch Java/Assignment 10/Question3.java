import java.util.Scanner;
class Question3{
	public static void main(String[] args) 
	{
		Scanner p=new Scanner(System.in);
		System.out.println("Enter The Month Name To Find Number Of Days In It\n1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\10.October\n11.November\n12.December");
		String month=p.next();
		switch(month)
		{

			case "January":
					System.out.println("31 Days");
					break;

			case "February":
					System.out.println("28 Days");
					break;

			case "March":
					System.out.println("31 Days");
					break;

			case "April":
					System.out.println("30 Days");
					break;

			case "May":
					System.out.println("31 Days");
					break;

			case "June":
					System.out.println("30 Days");
					break;

			case "July":
					System.out.println("31 Days");
					break;

			case "August":
					System.out.println("31 Days");
					break;

			case "September":
					System.out.println("30 Days");
					break;

			case "October":
					System.out.println("31 Days");
					break;

			case "November":
					System.out.println("30 Days");
					break;

			case "December":
					System.out.println("31 Days");
					break;

			default:
				System.out.println("Invalid Input");



		}	
	}
}