class ByteWidening{
	public static void main(String[] args)
	{
		byte b=77;
		short s=b;
		 int i=b;
		long l=b;
		float f=b;
		double d=b;
		char c=i;//"Character Is An Unsigned Data Type So It Can Not Store "
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);


	}
}