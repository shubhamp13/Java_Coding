import java.util.Scanner;
class EvenOddDigit
{
	public static void main(String[] args) 
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=x.nextInt();
		int temp=num,evenCount=0,oddCount=0;
		while(temp!=0)
		{
			int rem=temp%10;
			if(rem%2==0)
			{
				System.out.print(rem+"E ");
				++evenCount;
			}
			else
			{
				System.out.print(rem+"O ");
				++oddCount;
			}
			temp/=10;
		}	
		System.out.println("Even Digits Count ="+evenCount+"\n Odd Digit Count:="+oddCount);
	}
}