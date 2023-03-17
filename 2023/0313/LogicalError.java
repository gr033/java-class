//사용자에게 두 수를 입력받아 곱하기하여 출력하는 프로그램을 작성
import java.util.Scanner;
class LogicalError
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		System.out.println("첫번째 수를 입력하세요");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		b = sc.nextInt();
		result = a+b;
		System.out.println("곱하기 결과 : " + result);
	}
}
