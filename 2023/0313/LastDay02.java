//연습) 사용자로부터 월을 입력받아 입력받은 월의 마지막 날을 출력해봅니다.
import java.util.Scanner;
class LastDay02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month, lastDay = 0;
		System.out.println("월을 입력하세요.");
		month = sc.nextInt();
		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			System.out.println(month + "월은 "+lastDay+"일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			System.out.println(month + "월은 "+lastDay+"일까지 있습니다.");
			break;
		case 2:
			lastDay = 28;
			System.out.println(month + "월은 "+lastDay+"일까지 있습니다.");
			break;
		default:
			System.out.println("입력범위를 초과하였습니다.");
		}
		
	}
}
