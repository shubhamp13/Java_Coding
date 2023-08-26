
class Question5{
	public static void main(String[] args) 
	{
		int perKm=4;
		int trainFare=400*perKm;
		int busFare=700*perKm;
		int rahulMoney=2000;
		
		System.out.println(trainFare<busFare?(trainFare<rahulMoney?"Train Fare Is Suitable":rahulMoney):(busFare<rahulMoney?"Bus Fare Is Suitable":rahulMoney));

		System.out.println(trainFare<busFare?"Train is More Suitable":"Bus Is More Suitable");

	}
}