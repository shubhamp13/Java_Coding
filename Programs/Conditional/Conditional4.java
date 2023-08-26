import java.util.Scanner ;
class Conditional4{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Do You Check Errors In Program");
		boolean res=input.nextBoolean();
		if(res==false)
		{
			System.out.println("Check It First");
		}	
		System.out.println("Compile And Run The Program");
	}
}