import java.util.Scanner;
class BuzzNumberRangeMethod
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
		System.out.println("Enter Start:");
		int start=xc.nextInt();
		System.out.println("Enter End:");
		int end=xc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(checkBuzzNuumber(i))
				System.out.print(i+" ");
		}
	}
}