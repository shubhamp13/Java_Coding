import java.util.Scanner;
class ForLoop5{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Range:");
		int num=ip.nextInt();
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}	
	}
}