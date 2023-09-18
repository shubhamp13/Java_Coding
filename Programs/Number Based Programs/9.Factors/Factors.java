import java.util.Scanner;
class Factors
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}	
	}
}