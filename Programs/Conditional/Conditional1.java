import java.util.Scanner;
class Conditional1{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How Is Weather Now,Is It Rainy???");
		boolean ans=input.nextBoolean();
		if(ans==true)
		{
			System.out.println("Take Umbrella");
		}
		System.out.println("Go Outside");

	}
}