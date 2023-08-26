class DoubleTypeCasting{
	public static void main(String[] args) 
	{
		double d=129.213;

		float f=(float) d;
		System.out.println(f);//129.213

		long l=(long)d;
		System.out.println(l);//129

		int i=(int)d;
		System.out.println(i);//129

		char c=(char)d;
		System.out.println(c);//?

		short s=(short)d;
		System.out.println(s);//129

		byte b=(byte)d;
		System.out.println(b);//-127

	}
}