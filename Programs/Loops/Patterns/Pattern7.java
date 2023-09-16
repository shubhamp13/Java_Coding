//Odd Alphbates
class Pattern7{
	public static void main(String[] args) 
	{
		char ch=65;
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch +" ");
				ch+=2;

			}
			System.out.println();
		}	
	}
}