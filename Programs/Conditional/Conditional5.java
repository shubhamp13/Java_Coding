import java.util.Scanner ;
class Conditional5{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Do You Have Mediclaim Policy???");
		boolean res=input.nextBoolean();
		if(res==true)
		{
			System.out.println("Complete Mediclaim Procedure ") ;
		}
		System.out.println("Take Treatment");
	}
}