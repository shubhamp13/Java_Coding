class Question7{

	public static void main(String[] args) {
		char c1='A';
		System.out.print(((c1>=65&&c1<=90)||(c1>=97&&c1<=122))?"Given Data Is Charcter":"Given Data Is Not Character");
		int a=-12111,b=-1234567,c=1234,d=12;
		System.out.println((a>b&&a>c)?a:(b>c?b:c));
		System.out.println((a>b&&a>c&&a>d)?a:(b>a&&b>c&&b>d)?b:(c>d&&c>b&&c>a?c:d));
		
	}
}