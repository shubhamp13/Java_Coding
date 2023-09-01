import java.util.Scanner;
class Question1{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Character To Check It Is Vowel Or Consonant");
		char ch=ip.next().charAt(0);
		int choice=0;
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				choice=1;
			}
			else
			{
				choice=2;
			}
		}

	
		switch(choice)
		{
		case 1:
			System.out.println("The Character "+ch+" Is Vowel");
			break;
		case 2:
			System.out.println("The Character "+ch+" Is Consonant");
			break;
		default:
			System.out.println("The Character "+ch+" Is Not An Alphabet");


		}	
	}
	
}