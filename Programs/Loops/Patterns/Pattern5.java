class Pattern5{
	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");

			}
			System.out.println();
		}	
	}
}