import java.util.Scanner;
class Cal02
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
	
		System.out.println("Input first number : ");
		num1 = sc.nextInt();
		System.out.println("Input second number : ");
		num2 = sc.nextInt();

		System.out.println(num1+num2);
		System.out.println("sum :"+num1+num2);
		System.out.println("sum :"+(num1+num2));

	}
}