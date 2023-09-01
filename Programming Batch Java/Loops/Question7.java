// 7. Write a program to print all even numbers between 1 to 100
import java.util.Scanner;
class Question7{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter The Range:");
		int num=ip.nextInt();
		int cnt=0;
		while(cnt<=num)
		{
			if(cnt%2==0)
				System.out.print(cnt+" ");
			++cnt;
		}	
		System.out.println();
		System.out.println();


		int count=0;
		do
		{
			if(count%2==0)
				System.out.print(count+" ");
			++ count;
		}while(count<=num);
		System.out.println();
		System.out.println();
		
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}