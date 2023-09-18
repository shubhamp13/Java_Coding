import java.util.Scanner;
class DuckNumberMethod
{
	static boolean checkDuck(int num)
	{
		while(num!=0)
		{
			int rem=num%10;
			if(rem==0)
				break;
			num/=10;
		}
		if(num==0)
			return false;
		else
			return true;
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		if(checkDuck(num))
			System.out.println("Duck Number");
		else
			System.out.println("Not Duck Number");


	}
}