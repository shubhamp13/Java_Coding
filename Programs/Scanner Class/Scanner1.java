import java.util.Scanner;
class Scanner1{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First Name:");
		String first=sc.next();
		System.out.println("Enter Your Last Name:");
		String last=sc.next();
		// sc.nextLine();
		System.out.println("Enter Your Aadhar Card No:");
		long aadhar=sc.nextLong();

		System.out.println("Enter Your Mobile Number:");
		long mobileNo=sc.nextLong();
		System.out.println("Enter your Roll No:");
		int rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Your College Name:");
		String collegeName=sc.nextLine();
		System.out.println("Enter Your CGPA");
		float cgpa=sc.nextFloat();
		System.out.println("Enter Your Gender:");
		char gender=sc.next().charAt(0);
		System.out.println("Enter Your year of birth:");
		short yearOfBirth=sc.nextShort();
		System.out.println("Enter Your Birth Month In Number:");
		byte monthNumber=sc.nextByte();
		System.out.println("Enter your Date Of Birth:");
		byte date=sc.nextByte();
	
		System.out.println("Are You Married:1.true 2.False");
		boolean marriage=sc.nextBoolean();

		System.out.println("\t\tMy Introduction::\n");
		System.out.println("This Is "+first+" "+last);
		System.out.println("I am Pursuing My BCA From "+collegeName);
		System.out.println("My Contact No Is "+mobileNo);
		System.out.println("My aadhar no is "+aadhar);
		System.out.println("I Have Got "+cgpa+" In 2nd Year");
		System.out.println("GENDER: "+gender);
		System.out.println("D.O.B:-"+date+"-"+monthNumber+"-"+yearOfBirth);
		System.out.println("Roll No:"+rollNo);
		System.out.println("Marriage Status:-"+marriage);

	}
}