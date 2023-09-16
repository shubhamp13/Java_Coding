import java.util.Scanner;
class EvenSeries
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int range=ip.nextInt();
		for(int i=0;i<=range;)
		{
			i+=2;
			System.out.println(i+" ");
		}
	}
}