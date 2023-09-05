// 8. Write a program to print all odd number between 1 to 100
class Question8{
	public static void main(String[] args) 
	{
		// int n=0;
		// System.out.println("Odd Numbers Between 1-100");
		// while(n<=100)
		// {
		// 	if(n%2!=0)
		// 		System.out.print(n+" ");
		// 	++n;
		// }
		// System.out.println();
		// int count=0;
		// do
		// {
		// 	if(count%2!=0)
		// 		System.out.print(count+" ");
		// 	++count;
		// }while(count<=100);
		// System.out.println();


		// for(int i=0;i<=100;i++)
		// {
		// 	if(i%2!=0)
		// 		System.out.print(i+" ");
		// }

		int n=1;
		while(n<=100)
		{
			System.out.print(n+" ");
			n+=2;
		}
		System.out.println("\n\n");
		int count=1;
		do{
			System.out.print(count+" ");
			count+=2;
		}while(count<=100);
		System.out.println("\n\n");

		for(int i=1;i<=100;i+=2)
		{
			System.out.print(i+" ");
		}


	}
}