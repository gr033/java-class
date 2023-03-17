//사용자에게 월을 입력받아 입력한 월의 마지막 날짜를 출력하는 프로그램을 작성
//월을 입력하세요, x월의 마지막 날은 y일입니다.
import java.util.Scanner;
class LastDayTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month, lastDay =31;
		System.out.println("월을 입력하세요 : ");
		month = sc.nextInt();
		if (month <1 || month >12)
		{
			System.out.println("입력범위를 초과하였습니다.");
			return;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			lastDay = 30;
		}
		else if (month == 2)
		{
			lastDay = 28;
		}

		System.out.println(month + "월의 마지막 날은 "+lastDay+"일 까지 있습니다.");
	}
}
