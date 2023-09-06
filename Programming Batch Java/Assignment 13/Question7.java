import java.util.Scanner;
class Question7{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		int temp=num;
		int rem,arm=0;
		while(temp!=0)	
		{
			rem=temp%10;
			arm+=(rem*rem*rem);
			temp=temp/10;
		}
		if(arm==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}