//두개의 정수를 입력받아 나누기 결과를 출력하는 프로그램 작성
import java.util.Scanner;
class RuntimeError 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		System.out.println("첫번째 입력");
		a = sc.nextInt();
		System.out.println("두번째 입력");
		b = sc.nextInt();
		result = a/b;
		System.out.println("나누기 입력 : " + result);
	}
}
/*
C:\javaTest\day0313>java RuntimeError
첫번째 입력
4
두번째 입력
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at RuntimeError.main(RuntimeError.java:13)

		실행오류
*/