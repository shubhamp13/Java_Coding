class FloatTypeCasting{
	public static void main(String[] args) 
	{
		float f=1102.12f;

		double d= f;
		System.out.println(d);//1102.1199951171875

		long l=(long)f;
		System.out.println(l);//1102

		int i=(int)f;
		System.out.println(i);//1102

		char c=(char)f;
		System.out.println(c);// ?

		short s=(short)f;
		System.out.println(s);//1102

		byte b=(byte)f;
		System.out.println(b);//78("Wrong Output")

	}
}