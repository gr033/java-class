//사용자에게 월을 입력받아 입력한 월의 마지막 날짜를 출력하는 프로그램을 작성
//월을 입력하세요, x월의 마지막 날은 y일입니다.
import java.util.Scanner;
class LastDayTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("월을 입력하세요 : ");
		month = sc.nextInt();
		if (month <0 || month >12)
		{
			System.out.println("입력범위를 초과하였습니다.");
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
		{
			System.out.println(month + "월의 마지막 날은 31일입니다.");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			System.out.println(month + "월의 마지막 날은 30일입니다.");
		}
		else if (month == 2)
		{
			System.out.println(month + "월의 마지막 날은 28일입니다.");
		}
	}
}
