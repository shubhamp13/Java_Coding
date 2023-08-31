
class Demo{
	public static void main(String[] args) 
	{
		
		// if(System.out.printf("Without Semicolon")==null)
		// 	System.out.println("Printed");
		int a=10;
		float f=10.8f;
		double d=12.34;
		char c='A';
		String s="Shubham";
		System.out.printf("A:%d \nF:%f\nD:%f\nC:%c\nS:%s",a,f,d,c,s);
		//printf method is of void type
		//println is not void type method 
		//so we have to use printf method over println method for printing statement without semicolon



		// %d=It is Used To Print int data type values
		// %f=It is used to print float and double data type values
		// %c=It is used to print character
		// %s=It is used to print String on console
		// These Are The format Specifiers Which Are used in System.out.printf() Statement 
		// for avoiding the String Concatation problem in System.out.println().printf
		// when we are using System.out.println()method String Concatation takes place while printing The
		// integer And String together so to avoid this we use System.out.printf()method for printing
	}
	
}