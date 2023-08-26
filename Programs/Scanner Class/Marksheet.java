import java.util.Scanner;
class Marksheet{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your School Name:");
		String schoolName=input.nextLine();
		System.out.println("Enter Your Name:");
		String name=input.nextLine();
		System.out.println("Enter Your Class:");
		byte classNo=input.nextByte();
		System.out.println("Enter Your Section:");
		char sec=input.next().charAt(0);
		System.out.println("Enter Your Roll No:");
		byte rollNo=input.nextByte();
		System.out.println("Enter Your Marks:");
		System.out.println("Enter Your Marathi Marks:");
		int marathiMarks=input.nextInt();
		System.out.println("Enter Your English Marks:");
		int englishMarks=input.nextInt();
		System.out.println("Enter Your Maths Marks:");
		int mathMarks=input.nextInt();
		System.out.println("Enter Your Science Marks:");
		int scienceMarks=input.nextInt();
		
		String marathiGrade=(marathiMarks>=95&&marathiMarks<100)?"A+":(marathiMarks>=85&&marathiMarks<95)?"A":(marathiMarks>=75&&marathiMarks<85)?"B+":(marathiMarks>=50&&marathiMarks<75)?"B":(marathiMarks>=35&&marathiMarks<50)?"Pass":"Fail";

		String mathGrade=(mathMarks>=95&&mathMarks<100)?"A+":(mathMarks>=85&&mathMarks<95)?"A":(mathMarks>=75&&mathMarks<85)?"B+":(mathMarks>=50&&mathMarks<75)?"B":(mathMarks>=35&&mathMarks<50)?"Pass":"Fail";

		String englishGrade=(englishMarks>=95&&englishMarks<100)?"A+":(englishMarks>=85&&englishMarks<95)?"A":(englishMarks>=75&&englishMarks<85)?"B+":(englishMarks>=50&&englishMarks<75)?"B":(englishMarks>=35&&englishMarks<50)?"Pass":"Fail";

		String scienceGrade=(scienceMarks>=95&&scienceMarks<100)?"A+":(scienceMarks>=85&&scienceMarks<95)?"A":(scienceMarks>=75&&scienceMarks<85)?"B+":(scienceMarks>=50&&scienceMarks<75)?"B":(scienceMarks>=35&&scienceMarks<50)?"Pass":"Fail";


		// String marathiGrade;
		// if(marathiMarks>=95&&marathiMarks<100)
		// {
		// 	marathiGrade="A+";
		// }
		// else
		// {
		// 	if(marathiMarks>=85&&marathiMarks<95)
		// 	{
		// 		marathiGrade="A";
		// 	}
		// 	else
		// 	{
		// 		if(marathiMarks>=75&&marathiMarks<85)
		// 		{
		// 			marathiGrade="B+";
		// 		}
		// 		else
		// 		{
		// 			if(marathiMarks>=50&&marathiMarks<75)
		// 			{
		// 				marathiGrade="B";
		// 			}
		// 			else
		// 			{
		// 				if(marathiMarks>=35&&marathiMarks<50)
		// 				{
		// 					marathiGrade="Pass";
		// 				}
		// 				else
		// 				{
		// 					marathiGrade="Fail";
		// 				}
		// 			}
		// 		}
		// 	}
		// }
		// String englishGrade;
		// if(englishMarks>=95&&englishMarks<100)
		// {
		// 	englishGrade="A+";
		// }
		// else
		// {
		// 	if(englishMarks>=85&&englishMarks<95)
		// 	{
		// 		englishGrade="A";
		// 	}
		// 	else
		// 	{
		// 		if(englishMarks>=75&&englishMarks<85)
		// 		{
		// 			englishGrade="B+";
		// 		}
		// 		else
		// 		{
		// 			if(englishMarks>=50&&englishMarks<75)
		// 			{
		// 				englishGrade="B";
		// 			}
		// 			else
		// 			{
		// 				if(englishMarks>=35&&englishMarks<50)
		// 				{
		// 					englishGrade="Pass";
		// 				}
		// 				else
		// 				{
		// 					englishGrade="Fail";
		// 				}
		// 			}
		// 		}
		// 	}
		// }

		// String mathGrade;
		// if(mathMarks>=95&&mathMarks<100)
		// {
		// 	mathGrade="A+";
		// }
		// else
		// {
		// 	if(mathMarks>=85&&mathMarks<95)
		// 	{
		// 		mathGrade="A";
		// 	}
		// 	else
		// 	{
		// 		if(mathMarks>=75&&mathMarks<85)
		// 		{
		// 			mathGrade="B+";
		// 		}
		// 		else
		// 		{
		// 			if(mathMarks>=50&&mathMarks<75)
		// 			{
		// 				mathGrade="B";
		// 			}
		// 			else
		// 			{
		// 				if(mathMarks>=35&&mathMarks<50)
		// 				{
		// 					mathGrade="Pass";
		// 				}
		// 				else
		// 				{
		// 					mathGrade="Fail";
		// 				}
		// 			}
		// 		}
		// 	}
		// }

		// String scienceGrade;
		// if(scienceMarks>=95&&scienceMarks<100)
		// {
		// 	scienceGrade="A+";
		// }
		// else
		// {
		// 	if(scienceMarks>=85&&scienceMarks<95)
		// 	{
		// 		scienceGrade="A";
		// 	}
		// 	else
		// 	{
		// 		if(scienceMarks>=75&&scienceMarks<85)
		// 		{
		// 			scienceGrade="B+";
		// 		}
		// 		else
		// 		{
		// 			if(scienceMarks>=50&&scienceMarks<75)
		// 			{
		// 				scienceGrade="B";
		// 			}
		// 			else
		// 			{
		// 				if(scienceMarks>=35&&scienceMarks<50)
		// 				{
		// 					scienceGrade="Pass";
		// 				}
		// 				else
		// 				{
		// 					scienceGrade="Fail";
		// 				}
		// 			}
		// 		}
		// 	}
		// }
		System.out.println("************************************************************");
		System.out.println("\t\t"+schoolName+"\t\t2015\n");
		System.out.println("************************************************************");

		System.out.println("Name :"+name+"\t\t\t\tSec:"+sec);
		System.out.println("Class : "+classNo+"\t\t\t\t\tRoll No"+rollNo);
		System.out.println("*************************************************************\n");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Subject\t Total Marks\t Obtained Marks\t Grade\n");
		System.out.println("--------------------------------------------------------------");
		System.out.println("\n1.Maths\t\t"+"100\t\t"+mathMarks+"\t"+mathGrade);
		System.out.println("\n2.Sci\t\t"+"100\t\t"+scienceMarks+"\t"+scienceGrade);
		System.out.println("\n3.Eng\t\t"+"100\t\t"+englishMarks+"\t"+englishGrade);
		System.out.println("\n4.Mar\t\t"+"100\t\t"+marathiMarks+"\t"+marathiGrade);
		System.out.println("--------------------------------------------------------------");


		int totalMarks=marathiMarks+mathMarks+englishMarks+scienceMarks;
		double percentage=(100.0*totalMarks)/400.0;
		System.out.println("\nPercentage:"+percentage+"%");
		if(marathiMarks>35&&mathMarks>35&&englishMarks>35&&scienceMarks>35)
		{
			System.out.println("\nRemarks   : Eligible For Next Class");
		}
		else
		{
			System.out.println("\nRemarks   : Not Eligible For Next Class");

		}
		System.out.println("************************************************************");





	}
}