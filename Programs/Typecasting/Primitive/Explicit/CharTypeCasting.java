class CharTypeCasting{
	public static void main(String[] args) 
	{
		char c='S';

		double d= c;
		System.out.println(d);//83.0

		float f=c;
		System.out.println(f);//83.0

		long l=c;
		System.out.println(l);//83

		int i=c;
		System.out.println(i);//83

		short s=(short)c;
		System.out.println(s);//83

		byte b=(byte)c;
		System.out.println(b);//83

	}
}