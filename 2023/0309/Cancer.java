import java.util.Scanner;
class  Cancer
{
	public static void main(String[] args) 
	{
		String a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your name ->");
		a = sc.next();
		System.out.println("Input your age ->");
		b = sc.nextInt();
		
		if(b >= 40)
		{
			System.out.println(a+ " can get free test");
		}
		else
		{
			System.out.println(a+" cannot get free test");
		}
	}
}
