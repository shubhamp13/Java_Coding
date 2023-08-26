class ShortDataTypeCasting
{
	public static void main(String[] args) 
	{
		
		short s=18;
		// char c=s;
		int i=s;
		long l=s;
		float f=s;
		double d=s;
		System.out.println(s);//18

		// System.out.println(c);

		/* CTE:=(" possible lossy conversion from byte to char")
			Because char data type is unsigned data type so it can not store in Short*/
	
		System.out.println(i);//18

		System.out.println(l);//18

		System.out.println(f);//18.0

		System.out.println(d);//18.0



		
	}
	
}