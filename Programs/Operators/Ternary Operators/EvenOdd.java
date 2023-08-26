class EvenOdd{
	public static void main(String[] args) 
	{
		int a=121;
		String s=(a%2==0)?"Its Even number":"Its Odd Number";
		String s1=((a/2)*2==a)?"Its Even number":"Its Odd Number";
		System.out.println(s);
		System.out.println(s1);
	}
}