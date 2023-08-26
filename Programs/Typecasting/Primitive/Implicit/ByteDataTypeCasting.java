class ByteDataTypeCasting
{
	public static void main(String[] args) 
	{
		byte b=10;
		short s=b;
		// char c=b;
		int i=b;
		long l=b;
		float f=b;
		double d=b;
		System.out.println(b);//10
		System.out.println(s);//10

		// System.out.println(c);
		/* CTE:=(" possible lossy conversion from byte to char")
			Because char data type is unsigned data type so it can not store in byte*/

		System.out.println(i);//10
		System.out.println(l);//10
		System.out.println(f);//10.0
		System.out.println(d);//10.0



		
	}
	
}