import java.util.Scanner;
class Question4{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Random Number Between 1-6???");
		int prize1=500;
		int prize2=600;
		int prize3=700;
		int prize4=800;
		int prize5=900;
		int prize6=1000;

		int no=sc.nextInt();
		switch(no)
		{
			case 1:
					
					System.out.println("Cash price Won "+prize1);
					break;

			case 2:
					
					System.out.println("Cash price Won "+(prize1+prize2));
					break;

			case 3:
					
					System.out.println("Cash price Won "+(prize1+prize2+prize3));
					break;

			case 4:
					
					System.out.println("Cash price Won "+(prize1+prize2+prize3+prize4));
					break;


			case 5:
					
					System.out.println("Cash price Won "+(prize1+prize2+prize3+prize4+prize5));
					break;


			case 6:
					
					System.out.println("Cash price Won "+(prize1+prize2+prize3+prize4+prize5+prize6));
					break;

			default:
				System.out.println("Please Enter Number Between 1-6 only");




		}	
	}
	
}