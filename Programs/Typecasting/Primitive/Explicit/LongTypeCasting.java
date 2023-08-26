class LongTypeCasting{
	public static void main(String[] args) 
	{
		long l=1218l;

		double d= l;
		System.out.println(d);//1218.0

		float f=l;
		System.out.println(f);//1218.0

		int i=(int)l;
		System.out.println(i);//1218

		char c=(char)l;
		System.out.println(c);// ?

		short s=(short)l;
		System.out.println(s);//1218

		byte b=(byte)l;
		System.out.println(b);//-62("Wrong Output")

	}
}