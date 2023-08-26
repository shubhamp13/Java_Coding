// 4:If a
// person is earning  10758.25 per day  write a program in java  to check weather he is  eligible to pay  income  tax or not


// (note
// minimum  amount required  for being 
// eligible for income  tax is 7 lakh
// per month)
class Question4{

	public static void main(String[] args) 
	{
		double earningPerDay=10758.25;
		double earningPerYear=earningPerDay*365;
		double incomeTax=700000.0;
		System.out.println(earningPerYear>=incomeTax?"He Is Eligible For Paying Incometax":"He Is Not Eligible For Paying Income Tax");

	}
}