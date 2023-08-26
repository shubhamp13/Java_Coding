class Question2{
	public static void main(String[] args) 
	{
		int a=12,b=23,c=123,d=2;
		System.out.println((a>b&&a>c&&a>d)?a:(b>c&&b>d?b:(c>d?c:d)));
	}
}