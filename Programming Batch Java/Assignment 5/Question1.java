class Question1{
	public static void main(String[] args) {
		int rahulA1=45;
		int rahulA2=62;
		int rahulA3=85;
		int rahulA4=78;
		int rahulA5=91;
		int rahulTotal=rahulA1+rahulA2+rahulA3+rahulA4+rahulA5;

		int rohanA1=51;
		int rohanA2=82;
		int rohanA3=89;
		int rohanA4=92;
		int rohanA5=98;
		int rohanTotal=rohanA1+rohanA2+rohanA3+rohanA4+rohanA5;
		// System.out.println(rohanTotal);

		int arvindA1=50;
		int arvindA2=25;
		int arvindA3=84;
		int arvindA4=83;
		int arvindA5=98;
		int arvindTotal=arvindA1+arvindA2+arvindA3+arvindA4+arvindA5;

		double percentageRahul=(100*rahulTotal)/500.0;
		double percentageRohan=(100*rohanTotal)/500.0;
		double percentageArvind=(100*arvindTotal)/500.0;


		String higherPercentage=(percentageRahul>percentageRohan)&&(percentageRahul>percentageArvind)?"Rahul Got Highest Percentage":(percentageRohan>percentageArvind?"Rohan Got Highest Percentage":"Arvind Got Highest Percentage");
			System.out.println(higherPercentage);

		char rahulGrade=(percentageRahul>90)?'A':(percentageRahul>75?'B':'C');

		char rohanGrade=(percentageRohan>90)?'A':(percentageRohan>75?'B':'C');

		char arvindGrade=(percentageArvind>90)?'A':(percentageArvind>75?'B':'C');
		System.out.println();


		System.out.println("Arvind Has Got "+arvindGrade);
		System.out.println();

		System.out.println("Rahul Has Got "+rahulGrade);
		System.out.println();
		
		System.out.println("Rohan Has Got "+rohanGrade);



		char rahul='r';
		char rohan='r';
		char arvind='a';

		boolean result1=(rahul=='a'||rahul=='e'||rahul=='i'||rahul=='o'||rahul=='u')?true:false;
		boolean result2=(rohan=='a'||rohan=='e'||rahul=='i'||rohan=='o'||rohan=='u')?true:false;
		boolean result3=(arvind=='a'||arvind=='e'||arvind=='i'||arvind=='o'||arvind=='u')?true:false;
		System.out.println();


		System.out.println(result1==true?"Rahul Name Has Vowel":"Rahul Name Has No Vowel");
		System.out.println();

		System.out.println(result2==true?"Rohan Name Has Vowel":"Rohan Name Has No Vowel");
		System.out.println();

		System.out.println(result3==true?"Arvind Name Has Vowel":"Arvind Name Has No Vowel");


		

		int rahulAge=20;
		int rohanAge=22;
		int arvindAge=10;

		int rahulPocketMoney=15000;
		int rohanPocketMoney=2000;
		int arvindPocketMoney=5000;
		System.out.println();

		System.out.println((rahulGrade=='A'&&rahulAge>18&&rahulPocketMoney>1200&&result1==true)?"Rahul Is Eligible For Watching Movie":"Rahul Is Not Eligible For Watching Movie");
		System.out.println();

		System.out.println((rohanGrade=='A'&&rohanAge>18&&rohanPocketMoney>1200&&result2==true)?"Rohan Is Eligible For Watching Movie":"Rohan Is Not Eligible For Watching Movie");
		System.out.println();

		System.out.println((arvindGrade=='A'&&arvindAge>18&&arvindPocketMoney>1200&&result3==true)?"Arvind Is Eligible For Watching Movie":"Arvind Is Not Eligible For Watching Movie");




		










		
		
		

	}
}