import java.util.Scanner;
class PowerOfNumber
{
	public static void main(String[] args) 
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=cin.nextInt();
		System.out.println("Enter Power Of Number To Calculate ");
		int pow=cin.nextInt();
		int res=1;
		for(int i=0;i<pow;i++)
		{
			res=res*num;
		}	
		System.out.println(num+" Power "+pow+" Is "+res);
	}
}