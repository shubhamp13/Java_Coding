// 9. Write a program to find sum of all natural numbers between 1 to n
import java.util.Scanner;
class Question9{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=ip.nextInt();
		int sum=0;
		int count=1;
		// while(count<=num)
		// {
		// 	sum+=count;
		// 	++count;
		// }
		// System.out.println("The Sum Of "+num+" Natural Number Is "+sum);

		// do{
		// 	sum+=count;
		// 	++count;
		// }while(count<=num);
		// System.out.println("The Sum Of "+num+" Natural Number is "+sum);
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		 System.out.println("The Sum Of "+num+" Natural Number is "+sum);



	}
}