import java.util.Scanner;
class DigitToWords
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=ip.nextInt();
		String words=" ";
		for(int i=num;i!=0;i/=10)
		{
			int r=i%10;
			switch(r)
			{
				case 0:	words=" Zero "+words;
							break;
				case 1:	words=" One "+words;
							break;
				case 2:	words=" Two "+words;
							break;
				case 3:words=" Three "+words;
						break;
				case 4:words=" Four "+words;
						break;
				case 5:words=" Five "+words;
						break;
				case 6:words=" Six "+words;
						break;
				case 7:words=" Seven "+words;
						break;
				case 8:words=" Eight "+words;
						break;
				case 9:words=" Nine "+words;
						break;

			}
		}
		System.out.println(words);
	}
}