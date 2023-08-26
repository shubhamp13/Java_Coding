class MaxOfThree1{
	public static void main(String[] args) 
	{
		int a=11;
		int b=122;
		int c=9;
		int res;
		
		int max=a>b?(a>c?a:c):(b>c?b:c);
		int max1=(a>b?a:b)>c?(a>b?a:b):c;
		int max2=(b>c?b:c)>a?(b>c?b:c):a;
		int max3=(res=a>b?a:b)>c?res:c;
		int max4=(c>a?c:a)>b?(c>a?c:a):b;
		System.out.println(max);	
		System.out.println(max1);
		System.out.println(max2);	
		System.out.println(max3);
		System.out.println(max4);	


	}
}