//사용자에게 0~9사이의 수를 입력받아 한글표기식으로 출력
import java.util.Scanner;
class DigitToKor02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []kor = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		System.out.println("0~9 사이의 수를 입력하세요.");
		int i = sc.nextInt();

		if (i<0 || i>9)
		{
			System.out.println("입력 범위를 초과했습니다");
			return;
		}
		System.out.println(kor[i]);
	}
}
