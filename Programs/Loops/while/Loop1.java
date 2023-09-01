import java.util.Scanner;
class Loop1{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Print N natural Numbers");
		int num=sc.nextInt();
		int count=0;
		System.out.println("The N Natural Numbers are:");
		while(count<=num)
		{
			System.out.println(count);
			++count;
		}	
	}
	
}