import java.util.Scanner;
class GetFactorialOfANumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println();

		System.out.printf("The factorial of %d is :%d",num,fact(num));
	}
	public static int fact(int num)
	{
		int i =1 ,fact=1;

		while(i<=num)
		{
			fact=fact*i;
			i++;
		}

		return fact;
	}
}