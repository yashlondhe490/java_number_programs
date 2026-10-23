import java.util.Scanner;
class SumOfGivenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int num= sc.nextInt();
		System.out.println("Sum of number is :"+sumOf(num));
	}

	public static int sumOf(int num)
	{
		int sum=0;

		while(num!=0)
		{
			int last=num%10;
			sum+=last;
			num/=10;

		}
		return sum;
	}
}