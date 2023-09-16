import java.util.Scanner;
class PrimeDigits
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num;
		int count=0;
		while(temp!=0)
		{
			int rem=temp%10;
			if(rem==2||rem==3||rem==5||rem==7)
			{
				System.out.println(rem+" ");
				++count;
			}
			temp/=10;
		}	
		System.out.println("The Number Of Prime Digits In Number Are:"+count);
	}
}