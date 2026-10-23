/*
	A perfect number is a positive integer that equals the sum of its 
	proper divisors, meaning all of its divisors except the number itself.
*/
import java.util.Scanner;
class IsPerfectNumberOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num=sc.nextInt();

		System.out.printf("%d is: %s number",num,isPerfect(num));
	}
 
		
	public static String isPerfect(int num)
	{

		if(num<=0) 
			return "NOT A PERFECT";

		int i = 1,sum = 0;

		while(i < num)
		{
			if(num % i == 0) 
				sum = sum + i;
			i++;
		}

		return sum==num ? "PERFECT" : "NOT A PERFECT";
	}
}
