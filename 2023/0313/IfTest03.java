//사용자에게 정수 하나를 입력받아 그 수가 양수이면 그 수에 100을 더한 값을 출력하고 "작업종료"출력
//음수이면 그 수의 제곱을 출력하고 "작업종료" 출력
import java.util.Scanner;
class IfTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("수 입력");
		a = sc.nextInt();
		if(a>=0)
		{
			System.out.println(a+100);
		}
		else
		{
			System.out.println(a*a);
		}
		
		System.out.println("작업종료");
	}
}
