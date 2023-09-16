import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Number: ");
	 int num=sc.nextInt();
	 int temp=num;
	 int flag=0;
	 int div=1;

	 //finds the count of digits
	 while(num!=0)
	 {
	 	num=num/10;
	 	flag++;
	 }
	 if(flag%2==0)
	 {
	 	
	 }

	}
}