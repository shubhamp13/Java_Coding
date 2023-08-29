import java.util.Scanner;
class Question3{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=ip.nextInt();
		System.out.println("Enter Distance In Km To Travel:");
		double distance=ip.nextDouble();
		if(age>=0&&age<8)
		{
			if(distance>=0.0&&distance<=10.00)
			{
				double fare=5*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
			else if (distance>10.00&&distance<=50.00) 
			{
				double fare=20*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
			else if (distance>50.00) 
			{
				double fare=50*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
		}
		else if (age>10&&age<=60) 
		{
			if(distance>=0.00&&distance<=10.00)
			{
				double fare=10*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
			else if (distance>10.00&&distance<=50.00) 
			{
				double fare=40*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
			else if (distance>50.00) 
			{
				double fare=50*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
			
		}
		else if (age>60) 
		{
			if(distance>=0.00&&distance<=10.00)
			{
				double fare=4*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
			else if (distance>10.00&&distance<=50.00) 
			{
				double fare=20*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
			else if (distance>50.00) 
			{
				double fare=50*distance;
				System.out.println("You Need To Pay "+fare+" For "+distance+" KM");
			}
		}
	}
	
}