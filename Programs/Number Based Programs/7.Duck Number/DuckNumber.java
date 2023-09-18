import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		while(num!=0)
		{
			int rem=num%10;
			if(rem==0)
				break;
			num/=10;
		}	
		if(num==0)
			System.out.println("Not A Duck Number");
		else
			System.out.println("Duck Number");
	}
}