/* 
	A Buzz number is a number that either ends with 7 or 
	is divisible by 7 (or both).

*/
import java.util.Scanner;
class IsBuzzNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();

		System.out.println();
		System.out.printf("The enter number %d is %s number",num,isBuzz(num));	
	}

	public static String isBuzz(int num)
	{
		int last=num%10;
		return(last==7 || num % 7==0)?"BUZZ":"NOT A BUZZ";

	}

}