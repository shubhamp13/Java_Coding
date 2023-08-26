import java.util.Scanner;
class PositiveNegative{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		String res=(num>0)?"Number Is Positive":(num==0)?"Number Is Zero":"Number Is Negative";
		System.out.println(res);	
	}
}