// 3:Write java program  to print the table of given number
// ( note: number must be user input
import java.util.Scanner;
class Question1{

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);	
		System.out.println("Enter Number To Print Its Table");
		int num=ip.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}

}