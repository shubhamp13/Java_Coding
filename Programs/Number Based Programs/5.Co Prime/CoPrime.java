import java.util.Scanner;
class CoPrime
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num1=ip.nextInt();	
		System.out.println("Enter Number:");
		int num2=ip.nextInt();
		int min=num1<num2?num1:num2;
		int hcf=1;
		for (int i=1;i<min ;i++ ) 
		{
			if(num1%i==0&&num2%i==0)
			{
				hcf=i;
			}	
		}
		if(hcf==1)
			System.out.println(num1+" And "+num2+" Are Co-Prime Numbers.");
	}
}