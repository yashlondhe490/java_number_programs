import java.util.Scanner;
class BiggestNumberAmoungFourDigit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st Digit: ");
		int a= sc.nextInt();

		System.out.println("Enter the 2nd Digit: ");
		int b= sc.nextInt();
		
		System.out.println("Enter the 3rd Digit: ");
		int c= sc.nextInt();

		System.out.println("Enter the 4th Digit: ");
		int d= sc.nextInt();

		int big=a;
		if(b > big) big=b;
		if(c > big) big=c;
		if(d > big) big=d;

		System.out.println("biggest number is: "+big);


		
	}

}