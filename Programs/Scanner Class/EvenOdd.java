import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		System.out.println((num%2==0)?"Its Even":"Its Odd");

	}
	
}