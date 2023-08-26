import java.util.Scanner;
class Conditional3{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Have You Done Overtime Work??");
		boolean ans=sc.nextBoolean();
		if(ans==true)
		{
			System.out.println("You Will Get Overtime Bonus And");
		}	
		System.out.println("You Will Get Salary");
	}
}