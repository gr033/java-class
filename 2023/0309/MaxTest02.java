import java.util.Scanner;
class  MaxTest02
{
	public static void main(String[] args) 
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number ->");
		a = sc.nextInt();
		System.out.println("Input second number ->");
		b = sc.nextInt();
		
		if(a > b)
		{
			System.out.println("Bigger one is "+ a);
		}
		else
		{
			System.out.println("Bigger one is "+ b);
		}
	}
}
