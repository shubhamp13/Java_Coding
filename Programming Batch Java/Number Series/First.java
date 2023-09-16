// 1 9 17 33 49 73 97
import java.util.Scanner;
class First
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in) ;
		System.out.println("Enter Number Of Terms To Print Series:");
		int num=ip.nextInt() ;
		int count=0;
		int range=0;
		int i=1,x=1;

		   while(true)
		   {
		   		System.out.print(x+" ");
		   		x=x+i*8;
		   		++count;
		   		if(count==2)
		   		{
		   			i++;
		   			count=0;
		   		}
		   		++range;
		   		if(range==num)
		   			break;
		   }
		
	}
} 