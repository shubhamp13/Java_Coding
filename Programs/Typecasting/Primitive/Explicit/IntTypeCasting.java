class IntTypeCasting{
	public static void main(String[] args) 
	{
		int i=986;

		double d= i;
		System.out.println(d);//986.0

		float f=i;
		System.out.println(f);//986.0

		long l=i;
		System.out.println(l);//986

		char c=(char)i;
		System.out.println(c);// ?

		short s=(short)i;
		System.out.println(s);//986

		byte b=(byte)i;
		System.out.println(b);//-38("Wrong Output")

	}
}