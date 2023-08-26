class Increment5{
	public static void main(String[] args) 
	{
		int i=1,j=2,k=3;
		int m=i-- -j-- -k--;
		System.out.println(i);//0
		System.out.println(j);//1	
		System.out.println(k);//2
		System.out.println(m);//-4	

	}
}