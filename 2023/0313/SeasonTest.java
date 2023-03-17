import java.util.Scanner;
class SeasonTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		String result = "";
		System.out.println("몇월에 태어났습니까?");
		month = sc.nextInt();
		if (month < 1 || month >12)
		{
			System.out.println("입력값이 잘못되었습니다.");
			return;
		}
		if (month >=3 && month <=5)
		{
			result = "봄";
		}
		else if (month >=6 && month <= 8)
		{
			result = "여름";
		}
		else if (month >=9 && month <= 11)
		{
			result = "가을";
		}
		else 
		{
			result = "겨울";
		}
		System.out.println(month + "월은 " + result + "입니다.");

	}
}
