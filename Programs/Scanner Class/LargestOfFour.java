import java.util.Scanner;
class LargestOfFour{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();	

		System.out.println("Enter Second Number");
		int num2=sc.nextInt();

		System.out.println("Enter Third Number");
		int num3=sc.nextInt();

		System.out.println("Enter Fourth Number");
		int num4=sc.nextInt();

		int max=(num1>num2&&num1>num3&&num1>num4)?num1:(num2>num3&&num2>num4)?num2:(num3>num4)?num3:num4;
		System.out.println("Largest Number is"+max);
	}
}