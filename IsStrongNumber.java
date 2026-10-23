/*
	A Strong number is a number whose digits’ factorials 
	add up to the number itself.
*/


import java.util.Scanner;
class isXylemOrPhloemNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();

		int temp=num;
		int sum=0;

		while(temp !=0)
		{
			int last = temp %10;
			int fact=1;

				while(last>0)
				{
					fact*=last;
					last--;
				}

			 sum= sum+fact;
			temp/=10;
		}

		System.out.println(num==sum?"Given number is Strong ":"Given number is NOT a Strong ");
		


		
	}
}