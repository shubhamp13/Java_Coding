//7 12 19 28 39 52
// 5  7  9  11  13
import java.util.Scanner;
class Third
{
	public static void main(String[] args) 
	{
		Scanner xc=new Scanner(System.in) ;
		System.out.println("Enter Range:");
		int range=xc.nextInt();
		int x=7;
		int i=1;
		int count=0;
		while(true)
		{
			
			if(i>=5&&i%2!=0)
			{
				System.out.print(x+" ");
				x = x+i;
				++count;
			}
			++i;
			
			if(count==range)
				break;
		}	
	}
}