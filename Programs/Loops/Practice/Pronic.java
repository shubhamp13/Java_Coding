import java.util.Scanner;
class Pronic{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
	 
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				if(i*(i+1)==num)
				{
					 System.out.println("Pronic Number");
					 System.exit(0);
				}
			}
		}
		System.out.println("Not Pronic Number:");	
	}
}
//break=control will come out from loop
//return=control will come out from method
//System.exit() will come out from program