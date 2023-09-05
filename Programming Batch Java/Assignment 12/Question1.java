import java.util.Scanner;
class Question1{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);	
		System.out.println("Enter The Starting Point Of Range");
		int start=ip.nextInt();
		System.out.println("Enter The Ending Point Of Range");
		int end=ip.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			sum+=i;
		}
		
		System.out.println("The Sum of Range from "+start+" To "+end+" Is "+sum);
	}
}