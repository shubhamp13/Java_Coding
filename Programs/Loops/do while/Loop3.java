import java.util.Scanner;
class Loop3{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number To Print Its Multiplication Table");
		int num=ip.nextInt();
		int i=1;
		do
		{
			System.out.println(num+" * "+i+" = "+(num*i));
			++i;
		}	
		while(i<=10);
	}
	
}