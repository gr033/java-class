//연습) sum = 0;
//i =1;
//sum = sum+i;
//i = i+1;
//sum = sum+i;
//사용자에게 임의의 수 n을 입력받아 1에서 n까지의 합을 누적하여 출력하는 프로그램
import java.util.Scanner;
class SumTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, n, sum = 0;
		System.out.println("임의의 수를 입력하세요.");
		n = sc.nextInt();
		for (i = 1 ; i<=n ; i+=1)
		{
			sum = sum+i;
			System.out.println(sum);
		}
	}
}
