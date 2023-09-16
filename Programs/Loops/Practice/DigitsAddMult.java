import java.util.Scanner;
class DigitsAddMult{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num,sum=0,mult=1;
		while(temp!=0)
		{
			int rem=temp%10;
			sum+=rem;
			if(rem==0)
			{
				rem=1;
				mult*=rem;
			}
			else 
			{
				mult*=rem;
			}
			
			temp/=10;
		}	
		System.out.println("The Addition Of Digits Of The "+num+" Is "+sum);
		System.out.println("The Multiplication Of Digits Of The "+num+" Is "+mult);

	}
}