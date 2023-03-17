//사용자에게 3개의정수를 입력받아 그 중 가장 큰 수를 찾아 출력
import java.util.Scanner;
class MaxTest04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("첫번째 수 입력");
		a = sc.nextInt();
		System.out.println("두번째 수 입력");
		b = sc.nextInt();
		System.out.println("세번째 수 입력");
		c = sc.nextInt();
		if (a > b)
		{
			if(a > c)
			{System.out.println("제일 큰 수는 " + a);}
			else
			{System.out.println("제일 큰 수는 " + c);}
		}
		else
		{
			if(b > c)
			{System.out.println("제일 큰 수는 " + b);}
			else
			{System.out.println("제일 큰 수는 " + c);}
		}
	}
}
