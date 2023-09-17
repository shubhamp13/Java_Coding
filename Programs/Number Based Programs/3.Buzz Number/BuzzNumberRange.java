import java.util.Scanner;
class BuzzNumberRange
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Start:");
		int start=ip.nextInt();
		System.out.println("Enter End:");
		int end=ip.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%7==0||i%10==7)
			{
				System.out.print(i+"  ");
			}
		}
	}
}