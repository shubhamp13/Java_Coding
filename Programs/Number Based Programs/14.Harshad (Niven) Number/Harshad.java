import java.util.Scanner;
class Harshad
{
	public static void main(String[] args) 
	{
		Scanner q=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num=q.nextInt();
		int sum=0;
		for(int i=num;i!=0;i/=10)
		{
			int rem=i%10;
			sum+=rem;
		}	
		if(num%sum==0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("Not Harshad number");		
		}
	}
}