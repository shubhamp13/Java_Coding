import java.util.Scanner;
class Question3{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.nextLine();
		System.out.println("Have You Given The Mock If Yes Y Or No N ");
		char attend=sc.next().charAt(0);
		if(attend=='Y'||attend=='y')
		{
			System.out.println("Enter Your Mock First Rating Between 1-4");
			int firstMock=sc.nextInt();
			if(firstMock>=1&&firstMock<3)
			{
				System.out.println("Enter Your Second Mock Rating");
				int secondMock=sc.nextInt();
				if(secondMock>=1&&secondMock<=2)
				{
					
					System.out.println("Enter Your Third Mock Rating");
					int thirdMock=sc.nextInt();
					if(thirdMock>=1&&thirdMock<=2)
					{
						System.out.println("You Are Eligibel For Interviews");
					}
					else
					{
					 System.out.println("You Are Not Eligible For Interviews");
					}

				}
				else
				{
					System.out.println("You Are Not Eligible For Interviews");
				}
			}
			else
			{
				System.out.println("You Are Not Eligible For Interviews");
			}
		}
		else
		{
			System.out.println("Give Your First Mock");
		}



	}
}