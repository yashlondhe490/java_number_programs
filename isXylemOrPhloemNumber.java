/*
	A number with at least 3 digits where the sum of the first and last digits 
	(border digits) equals the sum of the middle digits. is called xylem number
	& the sum is not equals to middle digit is called phloem number.

*/

import java.util.Scanner;
class isXylemOrPhloemNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the number :");
		int num = sc.nextInt();

		System.out.printf("The entered number %d is %s number", num ,isXylemOrPhloem(num));

	}

	public static String isXylemOrPhloem(int num)
	{								
		int last=num%10;  
		num=num/10;			
		int mid=0;			

		while(num>9)		 
		{
			mid=mid+(num%10); 
			num=num/10;			
		}
		last=last+ num;  

		return last==mid? "XYLEM":"PHLOEM";



	}
}