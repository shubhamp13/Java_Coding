import java.util.Scanner;
class SeriesPrime
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter How Many Numbers You Want To Print") ;
		int limit=ip.nextInt();
		int count=0;
		for(int num=1;count<=limit;num++)
		{
			int i;
			for( i=2;i<num;i++)
			{
				if(num%i==0)
					break;
			}
			if(i==num)
			{
				System.out.print((i*i)+i+" ");
				++count;
			}
		}
	}
}