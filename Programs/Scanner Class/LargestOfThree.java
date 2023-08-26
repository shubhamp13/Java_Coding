import java.util.Scanner;
class LargestOfThree{
	public static void main(String[] args) 
	{
		int res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number:");
		int num3=sc.nextInt();

		int max=(res=num1>num2?num1:num2)>num3?res:num3;
		System.out.println("Maximum Of Three Number Is "+max);
	}
}