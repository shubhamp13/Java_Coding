import java.util.Scanner;
class Question3{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Charcter:");
		char ch=input.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Its Vowel");
			double d=ch;
			d=d/2;
			System.out.println((int)(d));
			System.out.println((char)d);
		}
		else
		{
			System.out.println("Its Consonant");
			int a=ch;
			System.out.println(2*a);
			System.out.println((char)a);
		}
	}
}