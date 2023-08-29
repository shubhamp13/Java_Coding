// 2:  Write a 
// program in java to accept a number 
// from user and  check whether that
// number is  single digit , two digit,
// three digit or four digit or more
import java.util.Scanner;
class Question2
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		while(num!=0)
		{
			num=num/10;
			++count;
		}	
		System.out.println("The No Of Digits Are "+count);
	}
}