import java.util.Scanner;
class Conditional2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Are You From Open Caste??");
		boolean ans=sc.nextBoolean();
		if(ans==false)
		{
			System.out.println("Attach Your Caste Certificate");
		}	
		System.out.println("Go To The Next Step To Fill The Form");
	}
}