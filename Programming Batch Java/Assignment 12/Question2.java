import java.util.Scanner;
class Question2{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The Starting Point Of Range");
		int start=input.nextInt();
		System.out.println("Enter The Ending Point Of Range");
		int end=input.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			sum+=(i*i);
		}
		System.out.println("The Sum of Range Of Sqaure  from "+start+" To "+end+" Is "+sum);


	}
}