//사용자에게 n을 입력받아 1~n까지의 합을 출력하는 프로그램을 while문 사용해서 출력
import java.util.Scanner;
class PlusTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요");
		int n = sc.nextInt();
		int i = 1, x=0;
		while (i <= n)
		{
			i++;
			x = x+i;
			System.out.println(x);
		}
		System.out.println("1~"+n+"까지의 합은 "+x);
	}
}