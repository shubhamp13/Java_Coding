import java.util.Scanner;
class Digits{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Number");
		int num=ip.nextInt();
		int temp=num;
		while(temp!=0)
		{
			int rem=temp%10;
			System.out.println(rem);
			temp/=10;
		}	
	}
}