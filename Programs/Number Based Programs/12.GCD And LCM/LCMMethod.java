import java.util.Scanner;
class LCMMethod
{
	static int LCM(int a,int b)
	{
		int max=a>b?a:b;
		int lcm=0;
		for(int i=max;;i++)
		{
			if(i%a==0&&i%b==0)
			{
				return i;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num1=ip.nextInt();
		System.out.println("Enter Number:");
		int num2=ip.nextInt();
		System.out.println("The LCM Of "+num1+" And "+num2+" Is "+LCM(num1,num2));

	}
}