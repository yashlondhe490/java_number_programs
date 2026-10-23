import java.util.Scanner;
class IsleapYearOrNot{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year= sc.nextInt();
		if (year<=0) 
		{
			System.out.println("Please enter Valid year :");
			
		}

		else if((year % 400 ==0) || (year %4==0 && year % 100 != 0 ))
		{
			System.out.printf("You entered year %d is a leap year%n",year);
		}
		else
		{
			System.out.printf("You entered year %d is Not a leap year%n",year);

		}

		
	}
}