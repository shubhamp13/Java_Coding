// 11. Write a program to find sum of all odd numbers between 1 to n
import java.util.Scanner;
class Question11{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number To Print Its Sum Of Odd Natural Numbers");
		int num=input.nextInt();
		int count=1;
		int sum=0;
		// while(count<=num)
		// {
		// 	if(count%2!=0)
		// 		sum+=count;
		// 	++count;
		// }
		// System.out.println("The Sum Of "+num+" Natural Number Is "+sum);//(1+3+5+7+9=25)

		// do
		// {
		// 	if(count%2!=0)
		// 		sum+=count;
		// 	++count;
		// }while(count<=num);
		// System.out.println("The Sum Of "+num+" Natural Number Is "+sum);//(1+3+5+7+9=25)

		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
				sum+=i;
		}
		System.out.println("The Sum Of "+num+" Natural Number Is "+sum);//(1+3+5+7+9=25)
		


	}
}