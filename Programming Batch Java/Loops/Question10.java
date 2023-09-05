// 10. Write a program to find sum of all even numbers between 1 to n
import java.util.Scanner;
class Question10{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Printr its Sum");
		int num=sc.nextInt();
		int sum=0;
		int count=1;
		// while(count<=num)
		// {
		// 	if(count%2==0)
		// 		sum+=count;
		// 	++count;
		// }
		// System.out.println("The Sum Of Even "+num+" Natural Number is "+sum);
		// do{
		// 	if(count%2==0)
		// 		sum+=count;
		// 	++count;
		// }while(count<=num);
		// System.out.println("The Sum Of Even "+num+" Natural Number is "+sum);
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				sum+=i;

		}
		System.out.println("The Sum Of Even "+num+" Natural Number is "+sum);
		

	}
}