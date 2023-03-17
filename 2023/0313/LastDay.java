//연습) 사용자로부터 월을 입력받아 입력받은 월의 마지막 날을 출력해봅니다.
import java.util.Scanner;
class LastDay
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("월을 입력하세요.");
		n = sc.nextInt();
		switch (n)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("해당 윌의 마지막 날은 30일입니다.");
			break;
		case 2:
			System.out.println("해당 윌의 마지막 날은 28일입니다.");
			break;
		default:
			System.out.println("해당 윌의 마지막 날은 31일입니다.");
			break;
		}
	}
}
