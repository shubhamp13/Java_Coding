// Up to Rs.3 lakh - 0% (Nil)
// Rs 3 lakh to 6 lakh - 5%
// Rs 6 lakh to 9 lakh - 10%
// Rs 9 lakh to Rs 12 lakh - 15%
// Rs 12 lakh to Rs 15 lakh - 20%
// Above Rs 15 lakh - 30%

import java.util.Scanner;
class IncometaxSlab{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=input.nextLine();
		System.out.println("Enter Yoour Salary:");
		double salary=input.nextDouble();
		if(salary>=0&&salary<=300000)
		{
			System.out.println("You Dont Have To Pay Any Tax on "+salary+" This Income");
		}	
		else if (salary>300000.0&&salary<=600000.0) 
		{
			double tax=(salary*5.0)/100;
			System.out.println("You Have To Pay 5% Tax Of "+tax+" On "+salary+" This Amount");
		}
		else if(salary>6000000.0&&salary<=900000.0)
		{
			double tax=(salary*10.0)/100;
			System.out.println("You Have To Pay 10% Tax Of "+tax+" On "+salary+" This Amount");
		}
		else if (salary>900000.0&&salary<=1200000.0) 
		{
			double tax=(salary*15.0)/100;
			System.out.println("You Have To Pay 15% Tax Of "+tax+" On "+salary+" This Amount");		
		}
		else if (salary>1200000.0&&salary<=1500000.0) 
		{
			double tax=(salary*20.0)/100;
			System.out.println("You Have To Pay 20% Tax Of "+tax+" On "+salary+" This Amount");	
		}
		else if (salary>1500000.0) 
		{
			double tax=(salary*30.0)/100;
			System.out.println("You Have To Pay 30% Tax Of "+tax+" On "+salary+" This Amount");
		}
		else
		{
			System.out.println("Enter Correct Amount....");
		}
	}
}