class ByteTypeCasting{
	public static void main(String[] args) 
	{
		byte b=110;

		double d= b;
		System.out.println(d);//110.0

		float f=b;
		System.out.println(f);//110.0

		long l=b;
		System.out.println(l);//110

		int i=b;
		System.out.println(i);//110

		char c=(char)b;
		System.out.println(c);//n

		short s=b;
		System.out.println(s);//110

	}
}