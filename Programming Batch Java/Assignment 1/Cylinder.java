class Cylinder{
	public static void main(String[] args) 
	{
		double radius=12.32;
		int height=4;
		double area=2*3.14*radius*height+2*3.14*radius*radius;
		System.out.println("Area Of Cylinder Is "+area);
		double perimeter=4*radius+height;
		System.out.println("perimeter Of Cylinder Is "+(int)perimeter);
		double volume=3.14*radius*radius*height;
		System.out.println("volume Of Cylinder Is "+(int)volume);

	}
}