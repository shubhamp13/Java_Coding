class MaxOfThreeNo{
	public static void main(String[] args) 
	{
		int a=12;
		int b=13;
		int c=120;
		int max=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(max);	
	}
}