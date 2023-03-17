import java.util.Scanner;
class SameTest
{
	public static void main(String[] args) 
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("A's age");
		a = sc.nextInt();
		System.out.println("B's age");
		b = sc.nextInt();

		if (a == b)
		{
			System.out.println("same age");
		}
		else if (a != b)
		{
			System.out.println("different age");
		}
	}
}
