class MinOfThreeNo{
	public static void main(String[] args) 
	{
		int a=12;
		int b=123;
		int c=1;
		int min=a<b?(a<c?a:c):(b<c?b:c);
		System.out.println(min);	
	}
	
}