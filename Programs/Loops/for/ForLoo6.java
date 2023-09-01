import java.util.Scanner;
class ForLoop6 
{
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Range:");
		int num=s.nextInt();
		int count=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}	
		if(count==2)
		{
			System.out.println("The Number Is "+num+" Prime");
		}	
	}	
}