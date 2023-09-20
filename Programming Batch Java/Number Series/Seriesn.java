import java.util.Scanner;
class Seriesn
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Range:");
		int range=ip.nextInt();
		int count=0;
		int n1=2,n2=3,n3;
		for(;;)
		{
			n3=(n1*n1)+n2;
			System.out.print(n3+" ");
			n1+=5;
			n2+=6;
			++count;
			if(count==range)
				break;
		}	
	}
}