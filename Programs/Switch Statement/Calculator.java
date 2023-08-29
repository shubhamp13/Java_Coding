import java.util.Scanner;
class Calculator{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=input.nextInt();
		System.out.println("Enter Second Number:");
		int num2=input.nextInt();
		System.out.println("Enter Operator To Perform Operation:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)\n5.Modulus(%)");
		char op=input.next().charAt(0);
		switch(op)
		{
		case '+':
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;

		case '-':
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
				break;
		case '*':
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
				break;

		case '/':
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
				break;

		case '%':
				System.out.println(num1+" % "+num2+" = "+(num1%num2));
		default:
			System.out.println("Enter Correct Operator To Perform operations:");
		}


	}

}