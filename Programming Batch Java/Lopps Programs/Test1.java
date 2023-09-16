import java.util.Scanner;
class Test1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The start Number: ");
		int start=sc.nextInt();
		System.out.println("Enter The End Number: ");
		int end=sc.nextInt();

		int sum=0;
		for (int i=start; i<=end;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
}