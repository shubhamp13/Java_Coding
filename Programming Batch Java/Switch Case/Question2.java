import java.util.Scanner;
class Question2{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Your Age??");
		int age=ip.nextInt();
		System.out.println("Are You Citizen Of India 1.Yes(Y)\n 2.No(N)");
		char citizen=ip.next().charAt(0);
		if(age>18&&(citizen=='Y'||citizen=='y'))
		{
			System.out.println("Enter Your Party Code(1,2,3,4):");
			int code=ip.nextInt();
			switch(code)
			{
			case 1:
					System.out.println("You Are Voted For BJP");
					break;
			case 2:
					System.out.println("You Are Voted For AAP");
					break;
			case 3:
					System.out.println("You Are Voted For Congress");
					break;
			case 'A':
					System.out.println("You Are Voted For AAP");
					break;
			default:
					System.out.println("Incorrect Input");


			}
		}
		else
		{
			System.out.println("You Are Not Eligible:");
		}	
	}
	
}