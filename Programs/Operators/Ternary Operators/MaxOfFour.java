class MaxOfFour{
	public static void main(String[] args) 
	{
		int a=12;
		int b=123;
		int c=1234;
		int d=-9;
		int max=(a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d?c:d);
		System.out.println(max);
		 	
	}
}