import java.util.Scanner;
class MultiplicationOfDigits
{
	public static void main(String[] args) 
	{
		Scanner qp=new Scanner(System.in) ;
		System.out.println("Enter Number:");
		int num=qp.nextInt();
		int mul=1;
		for(int i=num;i!=0;i/=10)
		{
			int rem=i%10;
			mul*=rem;
		}	
		System.out.println("Multiplication Of Digits:-"+mul);
	}
}