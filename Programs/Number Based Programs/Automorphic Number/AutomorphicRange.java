import java.util.Scanner;
class AutomorphicRange
{
	public static void main(String[] args) 
	{
		Scanner oc=new Scanner(System.in);
		System.out.println("Enter Start:");
		int start=oc.nextInt();
		System.out.println("Enter End:");
		int end=oc.nextInt();
		for(int i=start;i<=end;i++)
		{
			int square=i*i;
			int count=0;
			for(int j=i;j!=0;j/=10)
			{
				++count;
			}
			int denominator=1;
			for(int j=0;j<count;j++)
			{
				denominator*=10;
			}
			int extract=square%denominator;
			if(extract==i)
				System.out.print(i+"  ");
		}
	}
}