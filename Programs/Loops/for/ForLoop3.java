import java.util.Scanner;
class ForLoop3{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number To Print Its Multiplication Table");
		int num=ip.nextInt();
		for (int i=1;i<=10 ;i++ ) 
		{
			System.out.println(num+" * "+i+" = "+(num*i));	
		}
	}
	
}