import java.util.Scanner;
class ForLoop1{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Print N natural Numbers");
		int num=sc.nextInt();
		System.out.println("The N Natural Numbers are:");
		 for(int i=0;i<=num;i++)
		 {
			System.out.println(i);

		 }
	}
	
}