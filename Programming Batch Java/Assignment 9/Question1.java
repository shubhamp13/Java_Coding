import java.util.Scanner;
class Question1{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("The Number can be Divided By 2");
		}	
		else if (num%3==0)
		{
			System.out.println("The Number can be Divided By 3");

		}
		else if (num%5==0)
		{
			System.out.println("The Number can be Divided By 5");
		}
		else if (num%7==0)
		{
			System.out.println("The Number can be Divided By 7");
		}
		else if (num%8==0)
		{
			System.out.println("The Number can be Divided By 8");
		}
		else if (num%9==0)
		{
			System.out.println("The Number can be Divided By 9");
		}

		else
		{
			System.out.println("The Number Can Not Divided by 2,3,5,7,8,9");
		}

	}
	
}