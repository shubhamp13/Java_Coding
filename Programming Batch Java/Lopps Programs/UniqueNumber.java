import java.util.Scanner;
class UniqueNumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=ip.nextInt();
		int temp=num;
		int count=0;
		while(temp!=0)
		{
			count=0;
			int rem1=temp%10;
			int temp2=num;
			while(temp2!=0)
			{
				int rem2=temp2%10;
				if(rem1==rem2)
				{
					++count;
				}
				temp2/=10;
			}
			if(count>1)
				break;
			temp/=10;
		}		
		if(count==1)
			System.out.println("Unique Number");
		else
			System.out.println("Not Unique Number");
	}	
}