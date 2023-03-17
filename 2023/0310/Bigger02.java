//두 개의 정수를 입력받아 더 큰 수를 출력
import java.util.Scanner;
class Bigger02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2, big;
		System.out.println("첫번째 수를 입력하세요");
		num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		num2 = sc.nextInt();

		
		System.out.println(num1+"와(과) "+num2+"중 더 큰 수는 "+((num1>num2)?num1:num2)+"입니다");

	}
}
