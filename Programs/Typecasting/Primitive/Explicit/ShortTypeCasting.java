class ShortTypeCasting{
	public static void main(String[] args) 
	{
		short s=213;

		double d= s;
		System.out.println(d);//213.0

		float f=s;
		System.out.println(f);//213.0

		long l=s;
		System.out.println(l);//213

		int i=s;
		System.out.println(i);//213

		char c=(char)s;
		System.out.println(c);//?

		byte b=(byte)s;
		System.out.println(b);//-43

	}
}