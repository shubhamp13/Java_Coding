import java.util.Scanner;
class FarToCels{
	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Temprature In Farheneit");
	double far=sc.nextDouble();

	double cels=(far-32)*5/9.0;
	System.out.println("Temprature In Celcius Is "+cels);
		
	}
}