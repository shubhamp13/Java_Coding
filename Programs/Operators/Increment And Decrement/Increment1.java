class Increment1{
	public static void main(String[] args) 
	{
		int i=11;
		i=i++ + ++i;
		System.out.println(i);	//24
	}
}