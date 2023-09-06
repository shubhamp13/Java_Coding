import java.util.Scanner;
class Question8{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Range:");
		int start=sc.nextInt();
		System.out.println("Enter Ending Point:");
		int end=sc.nextInt();

		for(int i=start;i<=end;i++)
		{
			int rem=0;
			int temp=i;
			int arm=0;
			while(temp!=0)
			{
				rem=temp%10;
				arm+=(rem*rem*rem);
				temp/=10;
			}
			if(i==arm)
				System.out.println(i);
			
		}	
	}
	
}