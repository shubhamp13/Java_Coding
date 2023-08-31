import java.util.Scanner;
class Question1{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Pin Code:");
		int pinCode=ip.nextInt();
		switch(pinCode)
		{
			
				case 123:
				System.out.println("Enter Temprature??");
				int temp=ip.nextInt();
				if(temp>=0&&temp<10)
				{
					System.out.println("Water Intake:-3.0L To3.5L");
				}
				else if(temp>=10&&temp<20)
				{
					System.out.println("Water Intake:-3.5L To 4.5L");
				}
				else if(temp>=20&&temp<30)
				{
					System.out.println("Water Intake:-4.5L To 5.5L");
				}
				else if(temp>30&&temp<45)
				{
					System.out.println("Water Intake:-5.5L To 6.5L");
				}
				else
				{
					System.out.println("Invalid Tenprature");
				}
				break;
			
			
				case 456:
				System.out.println("Enter Temprature??");
				int temp2=ip.nextInt();
				if(temp2>=0&&temp2<10)
				{
					System.out.println("Water Intake:-3.0L To3.5L");
				}
				else if(temp2>=10&&temp2<20)
				{
					System.out.println("Water Intake:-3.5L To 4.5L");
				}
				else if(temp2>=20&&temp2<30)
				{
					System.out.println("Water Intake:-4.5L To 5.5L");
				}
				else if(temp2>30&&temp2<45)
				{
					System.out.println("Water Intake:-5.5L To 6.5L");
				}
				else
				{
					System.out.println("Invalid Tenprature");
				}
				break;
			
			
				case 789:
				System.out.println("Enter Temprature??");
				int temp1=ip.nextInt();
				if(temp1>=0&&temp1<10)
				{
					System.out.println("Water Intake:-3.0L To3.5L");
				}
				else if(temp1>=10&&temp1<20)
				{
					System.out.println("Water Intake:-3.5L To 4.5L");
				}
				else if(temp1>=20&&temp1<30)
				{
					System.out.println("Water Intake:-4.5L To 5.5L");
				}
				else if(temp1>30&&temp1<45)
				{
					System.out.println("Water Intake:-5.5L To 6.5L");
				}
				else
				{
					System.out.println("Invalid Tenprature");
				}
				break;	
			
		
		
		
		
			
			

		

		
		default:
		System.out.println("Enter Correct Pincode:");	
	}
	
	}
}