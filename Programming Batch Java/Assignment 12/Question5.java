//WAP to the number of digits in given number
import java.util.Scanner;
class Question5{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int count=0;
		int temp=num;
		// while(temp!=0)
		// {
		// 	temp/=10;
		// 	++count;
		// }
		for(;temp!=0;++count)
		{
			temp/=10;
		}
	 
		System.out.println("The Number Of Digits In "+num+" Is "+count);

	}
}