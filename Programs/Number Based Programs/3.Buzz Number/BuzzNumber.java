import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args) 
	{
		Scanner zp=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num=zp.nextInt();
		if(num%7==0||num%10==7)
		{
			System.out.println(num+" Is Buzz Number");
		}
		else
		{
			System.out.println(num+" Is Not Buzz Number");
		}


	}
}