//사용자로부터 n을 입력받아 두 수가 소수인지 판별하는 프로그램
import java.util.Scanner;
class SosuTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요.");
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i<=n ; i++)
		{if(n%i == 0){cnt ++;}}
		if (cnt == 2){System.out.println(n+"은 소수입니다.");}
		else{System.out.println(n+"은 소수가 아닙니다.");}
	}
}
