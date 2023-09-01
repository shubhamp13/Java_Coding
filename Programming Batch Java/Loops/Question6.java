// 6. Write a program to print reverse alphabets from Z to A
import java.util.Scanner;
class Question6{
	public static void main(String[] args) 
	{
		char ch=90;
		while(ch>=65)
		{
			System.out.print(ch+" ");
			--ch;
		}	
		System.out.println();

		char upperCase=90;
		do
		{
			System.out.print(upperCase+" ");
			-- upperCase;
		}while(upperCase>=65);
		System.out.println();
		for(char i=90;i>=65;i--)
		{
			System.out.print(i+" ");
		}
	}
}