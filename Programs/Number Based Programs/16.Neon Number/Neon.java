import java.util.Scanner;
class Neon
{
	public static void main(String[] args) 
	{
		Scanner q=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=q.nextInt();
		int square=num*num;
		int sum=0;
		for(int i=square;i!=0;i/=10)
		{
			int rem=i%10;
			sum+=rem;
		}	
		if(sum==num)
			System.out.println("Neon Number");
		else
			System.out.println("Not Neon Number");
		
	}
}