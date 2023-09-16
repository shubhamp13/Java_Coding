// 1,5,13,25,41...
// 4  8  12  16


import java.util.Scanner;
class Second
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter Range:");
		int range=sc.nextInt();
		int count=0;
		int x=1;
		int i=1;
		while(true)
		{
			System.out.print(x+" ");
			x=x+i*4;//x=1+=5,x=5+2*4=13,x=13+12=25,x=25+16=41
			++i;
			++count;
			if(count==range)
				break;
		}

	}
}