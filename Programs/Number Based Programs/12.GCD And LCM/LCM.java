import java.util.Scanner;
class LCM
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num1=ip.nextInt();
		System.out.println("Enter Number:");
		int num2=ip.nextInt();
		int max=num1>num2?num1:num2;
		int lcm=0;
		for(int i=max;;i++)
		{
			if(i%num1==0&&i%num2==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);
	}
}