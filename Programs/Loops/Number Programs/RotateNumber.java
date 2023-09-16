import java.util.Scanner;
class RotateNumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int rem=num%10;
		num/=10;
		int ans=0;
		int count=0;
		for(int i=num;i!=0;i/=10)
		{
			++count;
		}
		int pow=1;
		for(int i=0;i<count;i++)
		{
			pow*=10;
		}
		ans=rem*pow+num;
		System.out.println(ans);
	}
}