import java.util.Scanner;
class Question2{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter The Activity You Want To Do:\n1.Watch Movie\n2.Play Cricket\n3.Play Badminton\n4.Watch Netflix");
		int ch=ip.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println("Enter Amount You Have");

					int amt=ip.nextInt();
					int movieChoice=0;
					if(amt>0)
					{
						if(amt>=300&&amt<500)
						{
							movieChoice=1;
						}
						else if (amt>=500&&amt<1000) 
						{
							movieChoice=2;	
						}
						else if (amt>=1000) 
						{
							movieChoice=3;	
						}
					}
					else
					{
						System.out.println("Enter Positive Amount Only");
					}
					
				if(movieChoice>0)
				{

					switch(movieChoice)
					{
						case 1:
								System.out.println("You Are Watching Movie In PVR");
								break;
						case 2:
								System.out.println("You Are Watching Movie In INOX");
								break;

						case 3:
								System.out.println("You Are Watching Movie In IMAX");
								break;

					}
					break;
				}
			
			
		case 2:
				System.out.println("You Are Playing Cricket");
				break;

		case 3:
				System.out.println("You Are Playing Badminton");
				break;

		case 4:
				System.out.println("You Are Watching Netflix");
				break;
			



		}	
	}
}