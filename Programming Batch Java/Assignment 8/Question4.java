
import java.util.Scanner;
class Question4{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First Name:");
		String name=sc.next();
		if(name.charAt(1)=='a'||name.charAt(1)=='e'||name.charAt(1)=='i'||name.charAt(1)=='o'||name.charAt(1)=='u'||name.charAt(1)=='A'||name.charAt(1)=='E'||name.charAt(1)=='I'||name.charAt(1)=='O'||name.charAt(1)=='U')
		{
			System.out.println("Your Names Second Charcter Is Vowel");
		}
		else
		{
			System.out.println("Your Names Second Charcter Is Consonant");
		}

	}

	
}