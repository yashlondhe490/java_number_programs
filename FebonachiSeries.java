/*
	each number is the sum of the two numbers before it, 
	starting with 0 and 1.
*/
import java.util.Scanner;
class isXylemOrPhloemNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the iterations :");
		int num=sc.nextInt();

		int num1=0 ,num2=1,num3=0;

		while(num > 0 )
		{
			num3=num1+num2;
			System.out.println(num1);

			num1=num2;
			num2=num3;
			
			num--;
		}

	}
}