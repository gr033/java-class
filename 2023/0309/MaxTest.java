import java.util.Scanner;
class  MaxTest
{
	public static void main(String[] args) 
	{
		int a, b, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number ->");
		a = sc.nextInt();
		System.out.println("Input second number ->");
		b = sc.nextInt();
		
		if(a > b)
		{
			max = a;
		}
		else
		{
			max = b;
		}
		System.out.println("Bigger one is " + max);
	}
}
