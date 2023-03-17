//사용자로부터 n을 입력받아 n의 약수를 모두 출력하고 약수의 갯수도 구하여 출력하는 프로그램
import java.util.Scanner;
class YaksuTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요");
		int n = sc.nextInt();
		System.out.print(n+"의 약수 : ");
		int cnt=0;
		for (int i = 1 ; i<=n ; i++)
		{
			if (n%i == 0)
			{
				cnt++;
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("약수의 갯수 : "+cnt);
	}
}
