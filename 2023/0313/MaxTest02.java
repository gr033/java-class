//사용자에게 두개의 정수를 입력받아 그 중 큰 수를 찾아 출력하는 프로그램
import java.util.Scanner;
class MaxTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, Max;
		System.out.println("첫번째 수 입력");
		a = sc.nextInt();
		System.out.println("두번째 수 입력");
		b = sc.nextInt();
		Max = b;
		if (a > b)
			Max = a;
		
		System.out.println("큰수는 "+Max);
	}
}
