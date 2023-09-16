import java.util.Scanner;
class Question6{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=ip.nextInt();
		int temp=num;
		int count=0;
		while(temp!=0)
		{
			temp/=10;
			++count;
		}
		temp=num;
		int arm,rem,sum=0;
		while(temp!=0)
		{
			arm=1;
			rem=temp%10;
			for(int i=0;i<count;i++)
			{
				arm=arm*rem;
			}
			sum+=arm;
			temp/=10;
		}
		System.out.println(sum==num?"Its Armstrong Number":"Its Not Armstrong");

	}
}