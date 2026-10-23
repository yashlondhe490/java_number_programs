/* There is one bug in this programm
	whenver user types multiple zeros only
	it will show's only one zero
*/
import java.util.Scanner;

class CountTheZerosInDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();

		System.out.println();
		System.out.printf("The count Of Zeros are %d",counOfZero(num));
	}

	public static int counOfZero(int num)
	{
		int count=0;

		if(num==0) return 1;

		while(num>0)
		{
			int last=num%10;

			if(last==0) count++;

			num=num/10;

		}
	return count;
	}

}