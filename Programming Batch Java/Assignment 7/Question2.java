import java.util.Scanner;
class Question2{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=input.nextLine();

	

		System.out.println("Enter Your Country");
		String country=input.nextLine();

		if(country.equals("INDIA")||country.equals("india"))
		{
			System.out.println("Enter Your Age:");
			int age=input.nextInt();
			if(age>18)
			{
				System.out.println("Have you given your driving test Enter Y if Yes or N if NOT");
				char testGrade=input.next().charAt(0);
				if(testGrade=='Y'||testGrade=='y')
				{
					System.out.println("Enter Your Driving Test Score:");
					int testScore=input.nextInt();
					if(testScore>80)
					{
						System.out.println("Congratulations You Got Your License");
					}
					else
					{
						System.out.println("You Are Not Eligible FOr License");
					}
				}
				else
				{
					System.out.println("You Are Not Eligible FOr License");
				}
			}
			else
			{
				System.out.println("Ypu Are Not Eligible FOr License");

			}
		}
		else
		{
			System.out.println("You Are Not Eligible FOr License");

		}	
	}
}