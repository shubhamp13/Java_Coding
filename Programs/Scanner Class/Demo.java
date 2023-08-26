import java.util.Scanner;
class Demo{

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter No");
			int a=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name:");
			String s=sc.nextLine();
			System.out.println(a);
			System.out.println(s);
	}
}