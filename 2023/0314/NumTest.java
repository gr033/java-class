//사용자에게 0~99까지의 정수를 입력받아 한글표기식 출력하는 프로그램을 작성
//실행 예) 숫자를 입력하세요. 0~99사이의 수를 입력하세요. 7
//칠
import java.util.Scanner;
class NumTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("0~99사이의 수를 입력하세요.");
		int num1 = sc.nextInt();
		String ten = "", one = "";
		if (num1 == 0)
		{
			System.out.println("영");
			return;
		}
		else if (num1 >99 || num1<0)
		{
			System.out.println("입력범위를 초과하였습니다");
			return;
		}
		switch (num1/10){
		case 0:
			ten = "";
			break;
		case 1:
			ten = "십";
			break;
		case 2:
			ten = "이십";
			break;
		case 3:
			ten = "삼십";
			break;
		case 4:
			ten = "사십";
			break;
		case 5:
			ten = "오십";
			break;
		case 6:
			ten = "육십";
			break;
		case 7:
			ten = "칠십";
			break;
		case 8:
			ten = "팔십";
			break;
		case 9:
			ten = "구십";		
		}
		switch (num1%10){
		case 0:
			one = "";
			break;
		case 1:
			one = "일";
			break;
		case 2:
			one = "이";
			break;
		case 3:
			one = "삼";
			break;
		case 4:
			one = "사";
			break;
		case 5:
			one = "오";
			break;
		case 6:
			one = "육";
			break;
		case 7:
			one = "칠";
			break;
		case 8:
			one = "팔";
			break;
		case 9:
			one = "구";
		}
		System.out.println(ten + one);
	}
}
