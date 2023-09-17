import java.util.Scanner;
class BuzzNumberMethod
{
	static boolean checkBuzzNuumber(int n)
	{
		if(n%7==0||n%10==7)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner xc=new Scanner(System.in);	
		System.out.println("Enter Number:");
		int num=xc.nextInt();
		if(checkBuzzNuumber(num))
			System.out.println("Buzz Number");
		else
			System.out.println("Not Buzz Number");

	}
}