import java.util.Scanner;
class Calculator{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=s.nextInt();
		System.out.println("Enter Second Number:");
		int num2=s.nextInt();
		System.out.println("Enter Operator To do Operations:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)\n5.Modulus()%");
		char operator=s.next().charAt(0);
		if(operator=='+')
		{
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
		}
		else if (operator=='-') 
		{
			System.out.println(num1+" - "+num2+" = "+(num1-num2));	
		}	
		else if (operator=='*') 
		{
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
		}
		else if (operator=='/') 
		{
			if(num2==0)
			{
				System.out.println("Number Cant Divide By Zero");
			}
			else
			{
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			}
		}
		else if (operator=='%') 
		{
			System.out.println(num1+" % "+num2+" = "+(num1%num2));	
		}
		else
		{

			System.out.println("Please Enter Correct Operator");
		}
	}
}