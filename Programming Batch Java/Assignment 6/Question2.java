import java.util.Scanner;
class Question2{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// System.out.println("Enter Pune Temprature In Farheneit");
		// int pune=sc.nextInt();
		// System.out.println("Enter Mumbai Temprature In Farheneit");
		// int mumbai=sc.nextInt();
		// System.out.println("Enter Banglore Temprature In Farheneit");
		// int banglore=sc.nextInt();
		System.out.println("Enter Delhi Temprature In Farheneit");
		int delhi=sc.nextInt();

		// double puneInCels=(int)((pune-32)*5/9.0);
		// double mumbaiInCels=(int)((mumbai-32)*5/9.0);
		// double bangloreInCels=(int)((banglore-32)*5/9.0);
		double delhiInCels=(int)((delhi-32)*5/9.0);
		// System.out.println(puneInCels);

		// String puneDisplay=(puneInCels>0&&puneInCels<15)?"Its Very Cold In Pune":((puneInCels>15&&puneInCels<20)?"Its cold":(puneInCels>20&&puneInCels<30)?"Its Moderate":(puneInCels>30&&puneInCels<35)?"its Hot":"Its Very Hot");
		// String mumbaiDisplay=(mumbaiInCels>0&&mumbaiInCels<15)?"Its Very Cold In Mumbai":((mumbaiInCels>15&&mumbaiInCels<20)?"Its cold In Mumbai":(mumbaiInCels>20&&mumbaiInCels<30)?"Its Moderate":(mumbaiInCels>30&&mumbaiInCels<35)?"its Hot":"Its Very Hot");

		// String bangloreDisplay=(bangloreInCels>0&&bangloreInCels<15)?"Its Very Cold In Banglore":((bangloreInCels>15&&bangloreInCels<20)?"Its cold":(bangloreInCels>20&&bangloreInCels<30)?"Its Moderate":(bangloreInCels>30&&bangloreInCels<35)?"its Hot":"Its Very Hot");

		String delhiDisplay=(delhiInCels>0&&delhiInCels<15)?"Its Very Cold In Banglore":(delhiInCels>15&&delhiInCels<20)?"Its cold":(delhiInCels>20&&delhiInCels<30)?"Its Moderate":(delhiInCels>30&&delhiInCels<35)?"its Hot":"Its Very Hot";



		
		

		// System.out.println("Pune Condition"+puneDisplay);
		// System.out.println("Mumbai Condition"+mumbaiDisplay);
		// System.out.println("Banglore Condition"+bangloreDisplay);
		System.out.println("Delhi Condition"+delhiDisplay);








	}
}