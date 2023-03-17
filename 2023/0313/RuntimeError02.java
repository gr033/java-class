//두개의 정수를 입력받아 나누기 결과를 출력하는 프로그램 작성
import java.util.Scanner;
class RuntimeError02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, result;

		try{
		System.out.println("첫번째 입력");
		a = sc.nextInt();
		System.out.println("두번째 입력");
		b = sc.nextInt();
		result = a/b;
		System.out.println("나누기 입력 : " + result);
		}catch(Exception e)
		{
			System.out.println("숫자를 입력해야 하고 0으로 나눌 수는 없습니다");
			
		}
	}
}
