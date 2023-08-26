class Increment7{
	public static void main(String[] args) 
	{
	 int i=19,j=29,k;
	 k=i-- -i++ + --j - ++j + --i - j-- + ++i  -j++;
	 System.out.println(i);//19
	 System.out.println(j);	//29	
	 System.out.println(k);		//-20

	}
}