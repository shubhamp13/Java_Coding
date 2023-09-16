import java.util.Scanner;
class RotateNumberTime
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number Of Times To Rotate ");
		int rot=ip.nextInt();
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int ans=0;//123//312//231
		
		for(int i=0;i<rot;i++)
		{
			
			int sum=0,count=0;
			int rem=num%10;
			num/=10;
			for(int j=num;j!=0;j/=10)
			{
				++count;
			}
			int pow=1;
			for(int j=0;j<count;j++)
			{
				pow*=10;
			}
			 ans=rem*pow+num;
			num=ans;

		}
		System.out.println(ans);
	}
}