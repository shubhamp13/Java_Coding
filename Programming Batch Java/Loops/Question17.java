// 17. write a program to Check Whether a Given Number is Prime or Not
import java.util.Scanner;
class Question17{
	public static void main(String[] args) 
	{
	 Scanner ip=new Scanner(System.in);
	 System.out.println("Enter Number:");
	 int num=ip.nextInt();
	 int cnt=0;
	 for(int i=2;i<=num/2;i++)
	 {
	 	if(num%i==0)
	 	{
	 		++cnt;
	 	}
	 }
	 // System.out.println(cnt);
	 if(cnt!=0||num==1)
	 	System.out.println("Not Prime Number");
	 else
	 	System.out.println("Prime Number");	
	}
}