import java.util.Scanner;
class Question4{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		if(num>=0&&num<=9||num<0&&num>=-9)
		{
			System.out.println("No Of Digits:One");
		}	
		else if (num>=10&&num<=99||num<=-10&&num>=-99) 
		{
			System.out.println("No Of Digits:Two");
			
		}
		else if (num>=100&&num<=999||num<=-100&&num>=-999) 
		{
			System.out.println("No Of Digits:Three");
			
		}
		else if (num>=1000&&num<=9999||num<=-1000&&num>=-9999) 
		{
			System.out.println("No Of Digits:Four");
			
		}
		else if (num>=10000&&num<=99999||num<=-10000&&num>=-99999) 
		{
			System.out.println("No Of Digits:Five");
			
		}
	}
	
}