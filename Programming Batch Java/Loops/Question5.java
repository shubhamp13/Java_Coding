// . Write a program to print all alphabets from a to z
import java.util.Scanner;
class Question5{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);	
		char ch='a';
		while(ch<='z')
		{
			System.out.print(ch+" ");
			++ch;
		}
		System.out.println();

		char lowerCase='a';
		do
		{
			System.out.print(lowerCase+" ");
			++lowerCase;
		}while(lowerCase<='z');
		System.out.println();
		for(char i='a';i<='z';i++)
		{
			System.out.print(i+" ");
		}
	}
}