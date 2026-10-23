import java.util.Scanner;
class ThreeDigitArrangeInAssindingOrder
{
	public static void main(String[] arr)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Three digits: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//for finding biggest number 
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		
		// for finding small number
		int small=(a<b)?a:b;
		small=(small<c)?small:c;
		
		// for finding middle number thre is one formula
		// (a+b+c)-(big-small)
		int middle=(a+b+c)-(big+small);
		System.out.println("--------------");
		System.out.println(small);
		System.out.println(middle);
		System.out.println(big);




	}
}