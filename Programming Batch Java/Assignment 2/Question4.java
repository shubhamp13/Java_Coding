class Question4{
	public static void main(String[] args)
	{
		int weightOfCake=2;//Weight Of Cake In Pound
		int weightOfCakeInGrams=weightOfCake*450;//Weight Of Cake In Grams
		double weightOfCakeInOunce=weightOfCakeInGrams/28.0;// Weight Of Cake In Ounce
		double priceOfCake=(int)(weightOfCakeInOunce*1.23);
		System.out.println(priceOfCake);//39


	}
}