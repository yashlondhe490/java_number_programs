import java.util.Scanner;
class BiggestNumberAmoungThreeDigit
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

		System.out.println("The bigget of three digits are :"+( a>b? a>c ? a:c : b>c ? b:c));
		
	}
}